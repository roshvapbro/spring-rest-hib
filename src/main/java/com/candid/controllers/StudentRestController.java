package com.candid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.candid.entity.Student;
import com.candid.services.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> listEmployees() {

		List<Student> students = studentService.findAll();

		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	//@RequestMapping(value = "/stdregister", method = RequestMethod.POST)
	@PostMapping("/stdregister")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {

		studentService.saveOrUpdate(student);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		

	}
	
	

}
