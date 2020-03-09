package com.s.d.launcher.springcloud.controller;

import com.s.d.launcher.springcloud.entities.CommonResult;
import com.s.d.launcher.springcloud.entities.Payment;
import com.s.d.launcher.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果："+result);
        if (result>0){
            return new CommonResult(200,"数据插入成功",result);
        }else {
            return new CommonResult(250,"数据插入失败",null);
        }
    }
    @GetMapping(value = "/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询结果："+payment);
        if (payment!=null){
            return new CommonResult(200,"数据查询成功",payment);
        }else {
            return new CommonResult(250,"数据查询失败",null);
        }
    }
}
