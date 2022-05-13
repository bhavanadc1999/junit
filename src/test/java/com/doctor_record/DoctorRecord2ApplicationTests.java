package com.doctor_record;

import java.util.Iterator;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.doctor_record.entities.doctor;
import com.doctor_record.repository.doctorRepository;

@SpringBootTest
class DoctorRecord2ApplicationTests {
	@Autowired
	private doctorRepository repo;
	
	@Test
	void savedoctor() {
		doctor d=new doctor();
		d.setRoll_no(6L);
		d.setName("shubha");
		d.setMail_id("shubha@gmail.com");
		d.setMobile_no(783456734);
		repo.save(d);
		
		
	}

//	@Test
//	void updateRecord()
//	{
//	Optional<doctor> f = repo.findById(1L);
//	doctor s = f.get();
//	s.setName("Ajay Chitradurga");
//	s.setMail_id("ajayc@gmail.com");
//	repo.save(s);
//	}
//	
//	@Test
//	void deletedoctorsInfo()
//	{
//	repo.deleteById(3L);
//	}
//	
//	@Test
//	void doctor()
//	{
//	java.util.List<doctor> f = repo.findAll();
//	System.out.println(f);
//	Iterator<doctor> i = f.iterator();
//	while(i.hasNext())
//	{
//	doctor d1 = i.next();
//	System.out.println(d1.getRoll_no());
//	System.out.println(d1.getName());
//	System.out.println(d1.getMail_id());
//	System.out.println(d1.getMobile_no());
//	System.out.println("--------------------------");
//	}
//	}
}

