package com.lth.service;

import com.lth.dao.UserDao;
import com.lth.dto.UserDTO;
import com.lth.pojo.UserEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserDao userDao;
    @Override
    public void addUser(UserDTO dto) {
        UserEntity userEntity=new UserEntity();
        BeanUtils.copyProperties(dto,userEntity);
        userDao.save(userEntity);
    }

    @Override
    public void delUser(Long id) {

    }

    @Override
    public void updateUser(UserDTO dto) {

    }

    @Override
    public UserDTO findid(Long id) {
        return null;
    }

    @Override
    public void zhuanZhan(String username, long id) {

    }
}
