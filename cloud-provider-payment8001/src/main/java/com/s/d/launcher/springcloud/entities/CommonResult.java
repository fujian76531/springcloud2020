package com.s.d.launcher.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：launcher
 * @date ：Created in 2020/3/9
 * @description：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T   data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
