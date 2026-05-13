package com.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestUserUpdate {

	public static void main(String[] args) throws ParseException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		UserDTO dto = new UserDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		dto.setId(1);
		dto.setFirstName("Hardik");
		dto.setLastName("Mund");
		dto.setLoginId("hardik@gmail.com");
		dto.setPassword("asdf");
		dto.setDob(sdf.parse("2000-02-02"));
		dto.setAddress("Indore");

		Transaction ts = session.beginTransaction();

		session.update(dto);

		ts.commit();

	}

}
