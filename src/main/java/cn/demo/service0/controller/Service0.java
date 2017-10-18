package cn.demo.service0.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //是Spring Boot 项目的核心注解 主要目的是开启自动配置
@EnableDiscoveryClient //让服务发现服务器,使用服务器.Spring cloud 实现服务发现
@RestController //支持http请求
public class Service0 {

	@RequestMapping("/service0")
	public String service0(){
		
		return "ni zhen de hao a!";
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(Service0.class, args);
	}

}
