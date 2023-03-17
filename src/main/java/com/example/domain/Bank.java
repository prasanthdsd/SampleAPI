package com.example.domain;

import java.util.List;

public class Bank {
	
	private String bankName;
	private int intrestRate;
	private String bankAddress;
	
	private List<Employee> employee;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(int intrestRate) {
		this.intrestRate = intrestRate;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmpolyee(List<Employee> employee) {
		this.employee = employee;
	}
	
	public Bank() {
		
	}
	public Bank(String bankName, int intrestRate, String bankAddress,List<Employee> employee ) {
		super();
		this.bankName = bankName;
		this.intrestRate = intrestRate;
		this.bankAddress = bankAddress;
		this.employee = employee; 
	}
	
	
	
	
	

}
