package com.naruto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @InterfaceName NativeConfigServerApplication
 * @Description: TODO
 * @Author ZC
 * @Date 2020/9/1
 * @Time 18:59
 * @Version v1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class NativeConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class, args);
    }
}