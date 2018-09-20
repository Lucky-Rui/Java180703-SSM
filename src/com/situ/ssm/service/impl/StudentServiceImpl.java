package com.situ.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssm.dao.StudentMapper;
import com.situ.ssm.entity.Student;
import com.situ.ssm.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> jsonList() {
		return studentMapper.jsonList();
	}

}
