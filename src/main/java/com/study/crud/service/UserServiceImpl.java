package com.study.crud.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.crud.mapper.UserMapper;
import com.study.crud.model.User;
import com.study.crud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public void insert(User user) {
        baseMapper.insert(user);
    }
}
