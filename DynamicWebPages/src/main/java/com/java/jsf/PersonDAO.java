package com.java.jsf;

import java.util.List;

public interface PersonDAO {
	
	public String savePersonDao(Person person);
	void updatePersonRecordDao(Person person);
	List<Person> getAllPersonRecord();
	
}
