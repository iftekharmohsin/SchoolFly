package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.frozan.hlo.SubjectHlo;
import com.frozan.hlo.TransportStaffHlo;

@Repository("TransportStaffDao")

public class TransportStaffDao  extends TempletDao{
	public void save(TransportStaffHlo transportStaffHlo)
	{
		persist(transportStaffHlo);
	}
	
	public void modify(TransportStaffHlo transportStaffHlo)
	{
		
		update(transportStaffHlo);
	}
   public void delete(TransportStaffHlo transportStaffHlo)
   {
	   delete(transportStaffHlo);
   }
	public TransportStaffHlo findTransportStaffById(int id)
	{
		TransportStaffHlo transportStaffHlo=null;
		transportStaffHlo = new TransportStaffHlo();
		transportStaffHlo = (TransportStaffHlo) getSession().createQuery(
				"from TransportStaffHlo ts where ts.id=id").uniqueResult();
		return transportStaffHlo;
		
	}

	@SuppressWarnings("unchecked")
	public List<TransportStaffHlo> findAllTransportStaff()
	{
		List<TransportStaffHlo> transportStaffHlo = null;
		transportStaffHlo = new ArrayList<TransportStaffHlo>();
		transportStaffHlo = getSession().createQuery("from TransportStaffHlo ")
				.list();
		return transportStaffHlo;
	}
}
