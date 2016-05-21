package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.AdminHlo;

public interface AdminDao {
	
	void save(AdminHlo adminHlo) throws TelentCloudGenericException;
	void modify(AdminHlo adminHlo)throws TelentCloudGenericException;
	void delete(AdminHlo adminHlo)throws TelentCloudGenericException;
	AdminHlo getAdminById(int id) throws TelentCloudGenericException;
	List<AdminHlo> getAllAdmin()throws TelentCloudGenericException;

}
