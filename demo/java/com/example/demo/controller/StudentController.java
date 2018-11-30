package com.example.demo.controller;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/")
	public String getMessage() {
		return "Welcome Spring boot";

	}

<<<<<<< HEAD
	@RequestMapping(value = "/Inserted")
=======
	@RequestMapping(value = "/Save")
>>>>>>> branch 'master' of https://github.com/vishantkarale/EmpProject.git
	public void createStudent() {
		Student s1 = new Student("Vishant", "vvvvv");
		Student s2 = new Student("Nileshkumar", "nnnn");
		Student s3 = new Student("Kamlakar", "kkkkk");
		Student s4 = new Student("Pranita", "pppp");
		Set<Student> list = new LinkedHashSet<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		try {
			studentService.createStudent(list);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
