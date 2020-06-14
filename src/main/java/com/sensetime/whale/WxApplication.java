package com.sensetime.whale;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@SpringBootApplication
public class WxApplication {

	public static void main(String[] args) {
//		WebMvcConfigurationSupport
		ApplicationContext context = SpringApplication.run(WxApplication.class, args);
//		System.out.println(context.getBeanDefinitionCount());
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
	
}
