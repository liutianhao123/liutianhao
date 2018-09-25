package com.lth.service;

import com.lth.dto.UserDTO;

public interface UserService
{

    public void addUser(UserDTO dto);

    public void delUser(Long id);

    public void updateUser(UserDTO dto);

    public UserDTO findid(Long id);

    public void zhuanZhan(String username,long id);
}
