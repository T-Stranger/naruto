package com.naruto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @InterfaceName Student
 * @Description: TODO
 * @Author ZC
 * @Date 2020/8/30
 * @Time 19:47
 * @Version v1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private Long id;
    private String name;
    private Integer age;
}