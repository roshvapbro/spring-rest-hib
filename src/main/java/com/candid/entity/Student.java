package com.candid.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Proxy;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "STUDENT")
@Proxy(lazy = false)
public class Student {

	@Id
	@Column(name = "sid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "uname")
	private String username;
	@Column(name = "password")
	private String password;

	@Column(name = "age")
	private long age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "email")
	private String email;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "STUDENT_PHONE", joinColumns = { @JoinColumn(name = "STUDENT") }, inverseJoinColumns = {
			@JoinColumn(name = "PHONE") })

	private Set<Phone> studentPhoneNumbers = new HashSet<Phone>();

	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT") }, inverseJoinColumns = {
			@JoinColumn(name = "COURSE") })
	private Set<Course> studentCourses = new HashSet<Course>();
	
	

	public Student() {
		
	}

	public Student(long id, String username, String password, long age, String gender, String email, Address address,
			Set<Phone> studentPhoneNumbers, Set<Course> studentCourses) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.studentPhoneNumbers = studentPhoneNumbers;
		this.studentCourses = studentCourses;
	}

	public long getId() {
		return this.id;

	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {

		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Phone> getStudentPhoneNumbers() {
		return studentPhoneNumbers;
	}

	public void setStudentPhoneNumbers(Set<Phone> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	public Set<Course> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(Set<Course> studentCourses) {
		this.studentCourses = studentCourses;
	}

}
