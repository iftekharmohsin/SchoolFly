package com.frozan.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.frozan.entity.Parent;
import com.frozan.hlo.ParentHlo;

public class ParentDao {
	private HibernateTemplate hibernateTemplate = null;

	public ParentDao(HibernateTemplate hibernateTemplate) {
		// super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public void insertParent(ParentHlo parentHlo) {
		// TODO: IMPLEMENTATION
	}

	public Parent fetchParent(String parentId) {
		// TODO: IMPPLEMENTATION
		Parent parent = null;
		return parent;

	}

}
