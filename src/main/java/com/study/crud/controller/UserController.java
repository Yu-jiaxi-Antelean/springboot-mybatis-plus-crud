package com.study.crud.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.study.crud.model.User;
import com.study.crud.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //查看数据库
    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    //增
    @RequestMapping("/insert")
    public String insert(Long id,String name,Integer age,String email) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        userService.insert(user);
        return "添加成功！";
    }

    //删
    @RequestMapping("/remove")
    public String remove(Long id) {
        userService.removeById(id);
        return "id:"+id+" 移除成功!";
    }

    //改
    @RequestMapping("/update")
    public String update(User user) {
        userService.updateById(user);
        return "修改成功";
    }

    //查
    @GetMapping("/selectById")
    public User select(Long id) {
        userService.getById(id);
        return userService.getById(id);
    }

}
