package com.study.crud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.study.crud.mapper")
public class MybatisPlusConfig {
}
