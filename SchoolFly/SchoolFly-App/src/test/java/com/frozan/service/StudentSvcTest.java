package com.frozan.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.frozan.hlo.StudentHlo;

public class StudentSvcTest {

	private StudentSvc studentSvc;
	@Before
	public void setUp() throws Exception {
		studentSvc =new StudentSvc();
		
	}

	@Test
	public void testSave() {
	/*	StudentHlo studentHlo=new StudentHlo();
		studentHlo.setId(123);
		studentHlo.setStdDateOfBirth(new Date());
		studentHlo.setStdFirstName("kaushal");
		studentHlo.setStdMiddleName("kl");
		studentHlo.setStdLastName("hari");
		studentHlo.setStdGender("male");
		studentSvc.save(studentHlo);*/
		int i=studentSvc.get();
		assertEquals(2, i);

		
	}

}
