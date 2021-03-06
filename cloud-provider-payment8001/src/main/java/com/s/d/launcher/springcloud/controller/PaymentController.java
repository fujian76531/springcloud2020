package com.s.d.launcher.springcloud.controller;

import com.s.d.launcher.springcloud.entities.CommonResult;
import com.s.d.launcher.springcloud.entities.Payment;
import com.s.d.launcher.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2020/3/9
 * @description：
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果："+result);
        if (result>0){
            return new CommonResult(200,"数据插入成功，serverPort："+serverPort,result);
        }else {
            return new CommonResult(250,"数据插入失败，serverPort："+serverPort,null);
        }
    }
    @GetMapping(value = "/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询结果："+payment);
        System.out.println("test");
        if (payment!=null){
            return new CommonResult(200,"数据查询成功，serverPort："+serverPort,payment);
        }else {
            return new CommonResult(250,"数据查询失败，serverPort："+serverPort,null);
        }
    }

    @GetMapping(value = "/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("*************service："+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
