package com.naruto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @InterfaceName Student
 * @Description: TODO
 * @Author ZC
 * @Date 2020/8/31
 * @Time 19:29
 * @Version v1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;
    private String name;
    private Integer age;
}