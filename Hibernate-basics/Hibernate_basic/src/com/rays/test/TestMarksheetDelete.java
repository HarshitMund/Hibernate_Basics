package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.marksheet.MarksheetDTO;

public class TestMarksheetDelete {
	
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction ts = session.beginTransaction();

		MarksheetDTO dto = new MarksheetDTO();

		dto.setId(1);

		session.delete(dto);

		ts.commit();

	}

}
