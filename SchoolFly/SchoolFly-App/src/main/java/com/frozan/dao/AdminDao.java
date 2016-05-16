package com.frozan.dao;
/**Imports*/
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.frozan.hlo.AdminHlo;


@Repository("adminDao")
public class AdminDao extends TempletDao {

public void save(AdminHlo adminHlo)
{
  persist(adminHlo)	;
}


public void modify(AdminHlo adminHlo)
{
	update(adminHlo);
}

public void delete(AdminHlo adminHlo)
{
	delete(adminHlo);
}

public AdminHlo getAdminById(int id)
{
	AdminHlo adminHlo=null;
	adminHlo=new AdminHlo();
	adminHlo=(AdminHlo)getSession().createQuery("from AdminHlo a where a.id=id").uniqueResult();
	return adminHlo;
	
}

@SuppressWarnings("unchecked")
public List<AdminHlo> getAllAdmin()
{
	List<AdminHlo> adminHlo=null;
	adminHlo=new ArrayList<AdminHlo>();
	adminHlo=getSession().createQuery("from AdminHlo").list();
	return adminHlo;
}
}
