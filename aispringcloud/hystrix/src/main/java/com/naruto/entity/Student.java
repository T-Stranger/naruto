package com.naruto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @InterfaceName Student
 * @Description: TODO
 * @Author ZC
 * @Date 2020/9/1
 * @Time 13:59
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