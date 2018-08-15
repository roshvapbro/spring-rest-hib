package com.candid.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.candid.dao.StudentDao;
import com.candid.entity.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	public void saveOrUpdate(Student student) {
		studentDao.saveOrUpdate(student);

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
