package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    int addStudent(Student student);
    int updateStudent(@Param("id")int id,@Param("age") int age);
    Student searchStudent(String name);
    List<Student> findStudent();
    int deleteStudent(String name);
}
