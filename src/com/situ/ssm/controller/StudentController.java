package com.situ.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.ssm.entity.Student;
import com.situ.ssm.service.IStudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;

	@RequestMapping(value = "/jsonList")
	@ResponseBody
	public List<Student> jsonList() {
		return studentService.jsonList();
	}
}
