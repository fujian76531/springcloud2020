package com.s.d.launcher.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：launcher
 * @date ：Created in 2020/3/10
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class eurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(eurekaMain7002.class, args);
    }

}
