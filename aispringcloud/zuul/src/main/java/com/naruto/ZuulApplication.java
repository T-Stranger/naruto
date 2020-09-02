package com.naruto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @InterfaceName ZuulApplication
 * @Description: TODO
 * @Author ZC
 * @Date 2020/8/31
 * @Time 13:48
 * @Version v1.0
 **/
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}