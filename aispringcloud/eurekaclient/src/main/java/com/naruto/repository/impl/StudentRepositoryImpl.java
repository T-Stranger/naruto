package com.naruto.repository.impl;

import com.naruto.entity.Student;
import com.naruto.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @InterfaceName StudentRepositoryImpl
 * @Description: TODO
 * @Author ZC
 * @Date 2020/8/30
 * @Time 19:52
 * @Version v1.0
 **/
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "鸣人", 21));
        studentMap.put(2L, new Student(2L, "佐助", 22));
        studentMap.put(3L, new Student(3L, "小樱", 23));
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}