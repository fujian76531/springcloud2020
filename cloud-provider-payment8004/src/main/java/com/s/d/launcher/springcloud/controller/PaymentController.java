package com.s.d.launcher.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ：launcher
 * @date ：Created in 2020/3/11
 * @description：
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/zk")
    public String paymentzk(){
        return "SpringCloud with zookeeper: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
