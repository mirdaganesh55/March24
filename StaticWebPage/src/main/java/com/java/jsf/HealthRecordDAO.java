package com.java.jsf;

import java.util.List;

public interface HealthRecordDAO {
	
	void saveHealthRecordDao(HealthRecord healthRecord);
	void updateHealthRecord(HealthRecord healthRecord);
	HealthRecord getHealthRecordById(int healthRecordId);
	List<HealthRecord> getAllHealthRecord();
	void saveContactComplaintDao(Contact contact);
}
