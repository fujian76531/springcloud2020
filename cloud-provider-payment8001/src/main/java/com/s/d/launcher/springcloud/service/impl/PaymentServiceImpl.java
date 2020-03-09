package com.s.d.launcher.springcloud.service.impl;

import com.s.d.launcher.springcloud.dao.PaymentDao;
import com.s.d.launcher.springcloud.entities.Payment;
import com.s.d.launcher.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：launcher
 * @date ：Created in 2020/3/9
 * @description：
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
