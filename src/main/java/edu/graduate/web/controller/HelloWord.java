package edu.graduate.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description = "helloWord相关接口")
@RestController
@RequestMapping("/graduate")
public class HelloWord {
	@ApiOperation(value = "输出一串数字", notes = "单表")
	@GetMapping("/qwert")
	public void  helloWord() {
		System.out.println("sadfasdsdfa");
	}
}
