package com.liugang.alibabacloud.user.service.impl;

import com.liugang.alibabacloud.bean.User;
import com.liugang.alibabacloud.user.mapper.UserMapper;
import com.liugang.alibabacloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long userId) {
        return userMapper.selectById(userId);
    }
}
