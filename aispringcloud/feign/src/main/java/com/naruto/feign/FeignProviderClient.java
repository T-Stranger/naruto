package com.naruto.feign;

import com.naruto.entity.Student;
import com.naruto.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @InterfaceName FeignProviderClient
 * @Description: TODO
 * @Author ZC
 * @Date 2020/9/1
 * @Time 6:41
 * @Version v1.0
 **/
@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}