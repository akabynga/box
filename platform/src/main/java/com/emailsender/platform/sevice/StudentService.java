package com.emailsender.platform.sevice;

import java.util.List;

import com.emailsender.platform.model.Student;

public interface StudentService {

	Student getStudent(Long id);

	List<Student> getAllStudents();

	void delete(Long id);

	void update(Long id, Student student);

	void create(Student student);
}
