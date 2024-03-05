package com.hib.servlet;

import java.util.Date;
import java.util.List;

public interface StudentDAO {
	
	void studentRegistration(Student student);
	long loginDao(String Uemail, Date UDob);
}
