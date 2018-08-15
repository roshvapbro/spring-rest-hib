package com.candid.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PHONE")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PHONE_ID")
	private long phoneId;
	@Column(name="PHONE_TYPE")
	private String phoneType;
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	
	public Phone() {
	}
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Phone(long phoneId, String phoneType, String phoneNumber) {
		this.phoneId = phoneId;
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}
	public long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}

