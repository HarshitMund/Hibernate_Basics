package com.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestUserDelete {
	
	public static void main(String[] args) throws ParseException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		UserDTO dto = new UserDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		dto.setId(2);

		Transaction ts = session.beginTransaction();

		session.delete(dto);

		ts.commit();

	}

}
