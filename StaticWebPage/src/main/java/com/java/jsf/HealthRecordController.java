package com.java.jsf;

public class HealthRecordController {
	
	private HealthRecord healthrecord;
	private HealthRecordDAOImpl healthDao;
	
	public HealthRecord getHealthrecord() {
		return healthrecord;
	}
	public void setHealthrecord(HealthRecord healthrecord) {
		this.healthrecord = healthrecord;
	}
	public HealthRecordDAOImpl getHealthDao() {
		return healthDao;
	}
	public void setHealthDao(HealthRecordDAOImpl healthDao) {
		this.healthDao = healthDao;
	}
	
	public void saveHealthRecord(HealthRecord healthRecord) {
		healthDao.saveHealthRecordDao(healthRecord);
	}
	public void saveContactComplaint(Contact contact) {
		healthDao.saveContactComplaintDao(contact);
	}

}
