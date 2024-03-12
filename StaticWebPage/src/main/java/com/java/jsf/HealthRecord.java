package com.java.jsf;

import java.io.Serializable;

/* Serializable it is the process of converting the object into byte code which can easily save
 * Transmitted over network is known as Serializable This can be useful in various scenarios, 
 * such as when you need to save health records to a file, send them over a network, 
 * or store them in a database that supports object serialization. */

public class HealthRecord implements Serializable{
	
/*This line declares a serialVersionUID for the HealthRecord class with a value of 1L. 
 * The value is a version number that helps ensure compatibility between different versions 
 * of the class during the process of serialization and deserialization.*/
	
	private static final long serialVersionUID = 1L;

	private String id;
	private int age;
	private String patientName;
	private String diagnosis;
	private String doctorName;
	private String medication;
	private String prescription;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "HealthRecord [patientName=" + patientName + ", age=" + age + ", diagnosis=" + diagnosis
				+ ", doctorName=" + doctorName + ", medication=" + medication + ", prescription=" + prescription
				+ ", id=" + id + "]";
	}
	public HealthRecord(String patientName, int age, String diagnosis, String doctorName, String medication,
			String prescription, String id) {
		super();
		this.patientName = patientName;
		this.age = age;
		this.diagnosis = diagnosis;
		this.doctorName = doctorName;
		this.medication = medication;
		this.prescription = prescription;
		this.id = id;
	}
	public HealthRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
}
