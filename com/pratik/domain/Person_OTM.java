package com.pratik.domain;

import java.io.Serializable;
import java.util.Set;

public class Person_OTM implements Serializable{
	private int pid;
	private String name;
	private  String City;
	private Set<Mobiles_OTM> phones;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Set<Mobiles_OTM> getPhones() {
		return phones;
	}
	public void setPhones(Set<Mobiles_OTM> phones) {
		this.phones = phones;
	}
	
	@Override
	public String toString() {
		return "Person_OTM [pid=" + pid + ", name=" + name + ", City=" + City + "]";
	}
	
	

}
