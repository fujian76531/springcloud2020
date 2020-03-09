package com.s.d.launcher.springcloud.dao;

import com.s.d.launcher.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ：launcher
 * @date ：Created in 2020/3/9
 * @description：
 */
@Mapper
@Repository
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
