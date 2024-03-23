package com.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Address;
import com.ashokit.entity.Emp;
import com.ashokit.repo.AddrRepo;
import com.ashokit.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private AddrRepo addrRepo;
	
	public void getEmp() {
    Optional<Emp>findById= empRepo.findById(1);
    if(findById.isPresent()) {
    Emp	emp= findById.get();
    List<Address> adrList = emp.getAdrList();
    }
	}
	
	public void saveEmployee() {
		
		Emp e = new Emp();
		e.setEname("John");
		e.setEsal(14000.00);
		
		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setCountry("India");
		a1.setType("Present");
		
		Address a2 = new Address();
		a2.setCity("WGL");
		a2.setState("TG");
		a2.setCountry("India");
		a2.setType("Permanent");
		
		//association
		a1.setEmp(e); //parent
		a2.setEmp(e); //parent
		
		List<Address> adrList = Arrays.asList(a1,a2); //child
		e.setAdrList(adrList);
		
		//save parent record
		empRepo.save(e);
		
		
		
	}
	
	

}
