package com.frozan.service;

import com.frozan.dao.ParentDao;
import com.frozan.entity.Parent;
import com.frozan.hlo.ParentHlo;

public class ParentSvc {
	
	private ParentDao parentDao;
    ParentHlo parentHlo=new ParentHlo();
	public ParentSvc(ParentDao parentDao) {
		super();
		this.parentDao = parentDao;
	}
	
	public void insertParent(Parent parent){
		/*parentHlo.setPrntFirstName(parent.getPrntFirstName());
		parentHlo.setPrntMiddleName(parent.getPrntMiddleName());
		parentHlo.setPrntLastName(parent.getPrntLastName());
		parentHlo.setPrntGender(parent.getPrntGender());
		parentHlo.setPrntDateOfBirth(parent.getPrntDateOfBirth());*/
		
		parentDao.insertParent(parentHlo);
	}
	
	public Parent fetchParentById(String parentId){
	
		Parent Parent=null;
		Parent = parentDao.fetchParent(parentId);
		
		return Parent;
	}


}
