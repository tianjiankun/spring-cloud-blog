package com.tian.user.service.impl;

import com.tian.user.mapper.UsersMapper;
import com.tian.user.pojo.Users;
import com.tian.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users getUser(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }
}
