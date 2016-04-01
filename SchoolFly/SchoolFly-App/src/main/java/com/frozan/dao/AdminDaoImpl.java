package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.frozan.entity.Parent;
import com.frozan.hlo.AdminHlo;
import com.frozan.hlo.ExamTimeTableHlo;
import com.frozan.hlo.ParentHlo;
@Repository("adminDaoImpl")
public class AdminDaoImpl extends TempletDao {

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

public AdminHlo getTimeTableByid(int id)
{
	AdminHlo adminHlo=null;
	adminHlo=new AdminHlo();
	adminHlo=(AdminHlo)getSession().createQuery("from AdminHlo a where a.id=id").uniqueResult();
	return adminHlo;
	
}

@SuppressWarnings("unchecked")
public List<AdminHlo> getTimeTable()
{
	List<AdminHlo> adminHlo=null;
	adminHlo=new ArrayList<AdminHlo>();
	adminHlo=getSession().createQuery("from AdminHlo").list();
	return adminHlo;
}
}
