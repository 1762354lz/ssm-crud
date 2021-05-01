package com.bjpowernode.service;


import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentService {
 int insertStudent(Student student);
 int updateStudent(int id,int age);
 Student searchStudent(String name);
 List<Student> findStudent();
 int deleteStudent(String name);
}
