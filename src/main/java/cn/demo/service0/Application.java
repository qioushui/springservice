package cn.demo.service0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/21 23:01
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient //让服务发现服务器,使用服务器.Spring cloud 实现服务发现

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
