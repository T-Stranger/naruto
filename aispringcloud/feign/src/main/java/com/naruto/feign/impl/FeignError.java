package com.naruto.feign.impl;

import com.naruto.entity.Student;
import com.naruto.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @InterfaceName FeignError
 * @Description: TODO
 * @Author ZC
 * @Date 2020/9/1
 * @Time 7:11
 * @Version v1.0
 **/
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}