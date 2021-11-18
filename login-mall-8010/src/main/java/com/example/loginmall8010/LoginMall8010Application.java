package com.example.loginmall8010;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 13450
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class LoginMall8010Application {

    public static void main(String[] args) {
        SpringApplication.run(LoginMall8010Application.class, args);
        System.out.println("启动成功：Sa-Token配置如下：" + SaManager.getConfig());
    }

}
