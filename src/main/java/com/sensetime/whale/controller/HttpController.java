package com.sensetime.whale.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Controller
@RequestMapping
public class HttpController {
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String log(@RequestParam int id) {
		
		return "success";
	}
	
}
