package com.java.jsf;

import java.util.List;

public interface PersonDAO {
	
	public String savePersonDao(Person person,Employment employment);
	Person updatePersonRecordDao(Person person);
	List<Person> getAllPersonRecordDao();
}
