package com.naruto.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @InterfaceName NativeConfigHandler
 * @Description: TODO
 * @Author ZC
 * @Date 2020/9/1
 * @Time 19:12
 * @Version v1.0
 **/
@RestController
@RequestMapping("/native")
public class NativeConfigHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index() {
        return "当前端口：" + this.port + " 当前版本：" + this.foo;
    }
}