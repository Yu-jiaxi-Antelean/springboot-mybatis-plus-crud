package com.study.crud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.crud.model.User;

public interface UserService extends IService<User> {
    void insert(User user);
}
