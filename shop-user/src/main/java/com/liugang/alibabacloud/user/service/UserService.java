package com.liugang.alibabacloud.user.service;

import com.liugang.alibabacloud.bean.User;

public interface UserService {

    /**
     * 根据id获取用户信息
     */
    User getUserById(Long userId);
}
