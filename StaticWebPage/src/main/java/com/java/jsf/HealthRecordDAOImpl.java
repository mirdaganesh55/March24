package com.java.jsf;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HealthRecordDAOImpl implements HealthRecordDAO{
	
	SessionFactory sf;
	Session session;
	
	/*
	 * public static String generateUniqueId() { return
	 * UUID.randomUUID().toString(); }
	 */
	private static int counter = 0;
	 public static String generateContactId() {
	        // Increment the counter for each new ID
	        counter++;

	        // Create a custom ID starting with "CID001" followed by the counter value
	        return "CID" + String.format("%04d", counter);
	    }
	
	private static int currentId = 1;
    public static String generateMedicalID() {
        String prefix = "M";
        String formattedId = String.format("%03d", currentId);
        String medicalID = prefix + formattedId;
        currentId++;
        return medicalID;
    }
	
	@Override
	public void saveHealthRecordDao(HealthRecord healthRecord) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		String mediID = generateMedicalID();
		healthRecord.setId(mediID);
		session.save(healthRecord);
		trans.commit();
	}
	
	@Override
	public void updateHealthRecord(HealthRecord healthRecord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HealthRecord getHealthRecordById(int healthRecordId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HealthRecord> getAllHealthRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveContactComplaintDao(Contact contact) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		String ContactID = generateContactId();
		contact.setId(ContactID);
		Transaction trans = session.beginTransaction();
		session.save(contact);
		trans.commit();
	}

}
