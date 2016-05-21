package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.AllergiesHlo;

public interface AllergiesDao {
	
	void save(AllergiesHlo allergiesHlo) throws TelentCloudGenericException;
	void modify(AllergiesHlo allergiesHlo) throws TelentCloudGenericException;
	void delete(AllergiesHlo allergiesHlo) throws TelentCloudGenericException;;
	List<AllergiesHlo> findAllAllergies() throws TelentCloudGenericException;
	AllergiesHlo findAllergiesById(int id)throws TelentCloudGenericException;;

}
