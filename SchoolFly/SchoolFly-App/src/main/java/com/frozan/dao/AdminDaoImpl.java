package com.frozan.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.frozan.entity.Parent;
import com.frozan.hlo.ParentHlo;

public class AdminDaoImpl {

	private HibernateTemplate hibernateTemplate = null;

	public AdminDaoImpl(HibernateTemplate hibernateTemplate) {
		// super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public void insertAdmin(ParentHlo adminHlo) {
		// TODO: IMPLEMENTATION
	}

	public Parent fetchAdmin(String adminId) {
		// TODO: IMPPLEMENTATION
		Parent admin = null;
		return admin;

	}
}
