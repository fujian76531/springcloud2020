package com.s.d.launcher.springcloud.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.s.d.launcher.springcloud.vo.PaymentDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：launcher
 * @date ：Created in 2020/3/9
 * @description：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private long id;
    private String serial;
    @JsonSerialize(using = PaymentDateSerializer.class)
    private Date birthday;
    @JsonSerialize(using = PaymentDateSerializer.class)
    private Date birthda;
}
