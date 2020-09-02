package com.naruto.repository;

import com.naruto.entity.Student;

import java.util.Collection;

/**
 * @InterfaceName StudentRepository
 * @Description: TODO
 * @Author ZC
 * @Date 2020/8/30
 * @Time 19:46
 * @Version v1.0
 **/
public interface StudentRepository {

    public Student findById(Long id);

    public Collection<Student> findAll();

    public void saveOrUpdate(Student student);

    public void deleteById(Long id);
}