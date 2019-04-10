package edu.graduate.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("edu.graduate.dao")
public class MybatisConfig {

}
