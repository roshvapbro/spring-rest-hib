package com.candid.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.candid.entity.Student;


public interface StudentDao {
Student findById(Integer id);
	
	List<Student> findAll();

	void saveOrUpdate(Student student);
	
	void delete(int id);

}
