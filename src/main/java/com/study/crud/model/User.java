package com.study.crud.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yujx
 * @since 2020-12-4
 */
@Data
@TableName("user")    //表名
public class User {
    @TableId(value = "id")    //主键
    private Long id;
    private String name;
    private Integer age;
    private String email;

//    public User(){
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.email = email;
//    }


    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
