package com.pratik.domain;

import java.io.Serializable;

public class Mobiles_OTM {

	private long phonenumber;
	private String operator;
	
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		operator = operator;
	}
	
	@Override
	public String toString() {
		return "Mobiles_OTM [phonenumber=" + phonenumber + ", Operator=" + operator + "]";
	}
	
	
	
}
