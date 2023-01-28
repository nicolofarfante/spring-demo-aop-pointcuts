package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	public String name;
	public String serviceCode;

	public void addAccount(Account account, boolean vipLabel) {
		System.out.println(getClass() + ": DOING MY DB WORK -> ADDING AN ACCOUNT");
	}

	public String getName() {
		System.out.println("Calling getName in " + getClass());
		return name;
	}

	public void setName(String name) {
		System.out.println("Calling setName in " + getClass());
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("Calling getServiceCode in " + getClass());
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("Calling setServiceCode in " + getClass());
		this.serviceCode = serviceCode;
	}
	
}
