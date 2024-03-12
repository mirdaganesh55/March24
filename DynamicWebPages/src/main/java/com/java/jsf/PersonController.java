package com.java.jsf;

import java.util.List;

public class PersonController {
	
	private Person person;
	private PersonDAOImpl personDao;
	private Confirmation confirmation;
	
	
	public Confirmation getConfirmation() {
		return confirmation;
	}
	public void setConfirmation(Confirmation confirmation) {
		this.confirmation = confirmation;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public PersonDAOImpl getPersonDao() {
		return personDao;
	}
	public void setPersonDao(PersonDAOImpl personDao) {
		this.personDao = personDao;
	}
	public 	void savePerson(Person person) {
		personDao.savePersonDao(person);
	}
	public void clear(Person person) {
		personDao.clearDao(person);
	}
	public List<Person> getAllPersonRecord(){
		return personDao.getAllPersonRecordDao();
	}
	
}
