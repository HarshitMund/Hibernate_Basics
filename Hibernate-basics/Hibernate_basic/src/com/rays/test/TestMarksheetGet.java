package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rays.marksheet.MarksheetDTO;

public class TestMarksheetGet {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		MarksheetDTO dto = (MarksheetDTO) session.get(MarksheetDTO.class, 2);

		System.out.print(dto.getId());
		System.out.print("\t" + dto.getName());
		System.out.print("\t" + dto.getRollNo());
		System.out.print("\t" + dto.getChemistry());
		System.out.print("\t" + dto.getPhysics());
		System.out.println("\t" + dto.getMaths());

	}

}
