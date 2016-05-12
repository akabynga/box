package com.emailsender.platform.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emailsender.platform.dao.StudentDao;
import com.emailsender.platform.model.Student;
import com.emailsender.platform.sevice.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public Student getStudent(Long id) {
		return studentDao.findById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}

	@Override
	public void delete(Long id) {
		studentDao.delete(id);

	}

	@Override
	public void update(Long id, Student student) {
		studentDao.update(student);

	}

	@Override
	public void create(Student student) {
		studentDao.create(student);

	}

}
