package com.lth.dao;

import com.lth.pojo.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<UserEntity,Long> {
    //持久层已经开发完成.
    //crud+分页功能已经具备。
    @Query("from TbComputer where user like %:username%")
    public List<UserEntity> findByComModel(@Param("username") String comModel);

    @Modifying
    @Query("update TbComputer set username=?1 where id=?2")
    public void udpdateCom(String comModel,long comId);
    //参数必须对应?顺序
    //必须加事务,事务使用注解,可以加在服务层


}
