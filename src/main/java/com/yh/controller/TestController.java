package com.yh.controller;

import com.yh.mapper.DoorMapper;
import com.yh.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/** 测试类：测试springmvc开发环境 */
@Controller
public class TestController {
	@Autowired
	DoorMapper mapper;
	@RequestMapping("/hello")
	public String testSSM(){

		return "test";
	}
}