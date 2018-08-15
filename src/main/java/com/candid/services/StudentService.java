package com.candid.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.candid.entity.Student;

public interface StudentService {

	Student findById(Integer id);
	
	List<Student> findAll();

	void saveOrUpdate(Student student);
	
	void delete(int id);
}
