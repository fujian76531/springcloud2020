package com.s.d.launcher.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：launcher
 * @date ：Created in 2020/3/11
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain801 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain801.class,args);
    }
}
