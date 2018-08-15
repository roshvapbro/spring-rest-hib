package com.candid.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.candid.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	    private Session session;
	    private Transaction trans;


	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findAll() {
		
		Session session=this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Student> list =session.createCriteria(Student.class).list();
		return list;
	}

	public void saveOrUpdate(Student student) {
		
		Session session=this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);
		
		System.out.println("Record Inserted");
			
	}
	
	

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
