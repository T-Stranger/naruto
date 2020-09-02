package com.naruto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @InterfaceName FeignApplication
 * @Description: TODO
 * @Author ZC
 * @Date 2020/9/1
 * @Time 6:38
 * @Version v1.0
 **/
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}