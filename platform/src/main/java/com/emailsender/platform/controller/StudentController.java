package com.emailsender.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.emailsender.platform.model.Student;
import com.emailsender.platform.sevice.StudentService;

@Controller
@RequestMapping("/student")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody Student fetchNewsById(@PathVariable("id") Long id) {
		return studentService.getStudent(id);
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Student> fetchAllNews(@RequestParam int amount, @RequestParam int skip) {
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public @ResponseBody void updateNews(@PathVariable("id") Long id, @RequestBody Student student) {
		studentService.update(id, student);
	}

	/**
	 * Delete some news.
	 * 
	 * @param id
	 *            the id news for deleting
	 * @throws ControllerException
	 *             handler for service layer exception
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public @ResponseBody void deleteNews(@PathVariable("id") Long id) {
		studentService.delete(id);
	}

	/**
	 * Adding news to database.
	 * 
	 * @param body
	 *            the body
	 * @return the news
	 */
	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
	public @ResponseBody void createNews(@RequestBody Student student) {
		studentService.create(student);
	}

}
