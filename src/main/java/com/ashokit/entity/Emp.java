package com.ashokit.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	
	private String ename;
	
	private Double esal;
	
	@OneToMany(mappedBy = "emp",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Address> adrList;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsal() {
		return esal;
	}

	public void setEsal(Double esal) {
		this.esal = esal;
	}

	public List<Address> getAdrList() {
		return adrList;
	}

	public void setAdrList(List<Address> adrList) {
		this.adrList = adrList;
	}
	
	

}
