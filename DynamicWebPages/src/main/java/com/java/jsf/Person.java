package com.java.jsf;

import java.util.Date;

public class Person {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String ssn;  // Social Security Number
	private Date dateOfBirth;
	private String address;
	private String phoneNumber;
	private String email;
	private String income;
	private boolean isEmployed;
	private boolean hasDependents;
	
	public boolean getHasDependents() {
		return hasDependents;
	}
	public void setHasDependents(boolean hasDependents) {
		this.hasDependents = hasDependents;
	}
	
	public boolean getIsEmployed() {
		return isEmployed;
	}
	public void setIsEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	
	
}