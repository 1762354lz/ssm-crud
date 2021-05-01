package com.bjpowernode.service;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public int insertStudent(Student student) {
        int nums = studentDao.addStudent(student);
        return nums;
    }

    public int updateStudent(int id, int age) {
        int nums = studentDao.updateStudent(id, age);
        return nums;
    }

    public Student searchStudent(String name) {
        Student nums = studentDao.searchStudent(name);
        return nums;
    }
    public List<Student> findStudent() {
        List<Student> nums = studentDao.findStudent();
        return nums;
    }
    public int deleteStudent(String name) {
        int nums = studentDao.deleteStudent(name);
        return nums;
    }
}
