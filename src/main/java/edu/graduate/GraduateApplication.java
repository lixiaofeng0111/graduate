package edu.graduate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.graduate.dao")
public class GraduateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraduateApplication.class, args);
	}

}
