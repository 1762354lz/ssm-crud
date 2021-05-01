package com.bjpowernode.controller;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController  {
    @Resource
    private StudentService studentservice;

    @RequestMapping("/add.do")
    public ModelAndView addStusennt(Student student)
    {
        ModelAndView mv=new ModelAndView();
        int nums=studentservice.insertStudent(student);
        mv.addObject("nums",nums);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/update.do")
    public ModelAndView updateStusennt(int id,int age)
    {
        ModelAndView mv=new ModelAndView();
        int nums=studentservice.updateStudent( id, age);
        mv.addObject("nums",nums);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/selectone.do")
    public ModelAndView searchStusennt(String name)
    {
        ModelAndView mv=new ModelAndView();
        Student nums=studentservice.searchStudent(name);
        mv.addObject("nums",nums);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/selectall.do")
    public ModelAndView findStusennt()
    {
        ModelAndView mv=new ModelAndView();
        List<Student> nums=studentservice.findStudent();
        mv.addObject("nums",nums);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/delete.do")
    public ModelAndView deleteStudent(String name)
    {
        ModelAndView mv=new ModelAndView();
        int nums=studentservice.deleteStudent(name);
        mv.addObject("nums",nums);
        mv.setViewName("result");
        return mv;
    }
    }
