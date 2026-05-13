package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.marksheet.MarksheetDTO;

public class TestMarksheetSave {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction ts = session.beginTransaction();
		
		MarksheetDTO dto = new MarksheetDTO();
		
		dto.setName("Sidd");
		dto.setRollNo("124");
		dto.setChemistry(67);
		dto.setPhysics(77);
		dto.setMaths(87);
		
		session.save(dto);
		
		ts.commit();

	}

}
