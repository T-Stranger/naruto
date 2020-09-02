package com.naruto.handler;

import com.naruto.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @InterfaceName RestHandler
 * @Description: TODO
 * @Author ZC
 * @Date 2020/8/31
 * @Time 9:51
 * @Version v1.0
 **/
@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://localhost:8010/student/save", student, null).getBody();
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable("id") long id) {
        restTemplate.delete("http://localhost:8010/student/delete/{id}", id);
    }
}
