package com.naruto.handler;

import com.naruto.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @InterfaceName RibbonHandler
 * @Description: TODO
 * @Author ZC
 * @Date 2020/8/31
 * @Time 19:31
 * @Version v1.0
 **/
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForEntity("http://provider/student/findAll", Collection.class).getBody();
    }

    @GetMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }
}