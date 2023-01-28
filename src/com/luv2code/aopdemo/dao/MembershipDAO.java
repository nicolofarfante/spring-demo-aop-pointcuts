package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class MembershipDAO {

	public boolean addSillyMember() {
		System.out.println(getClass() + ": DOING STUFF -> ADDING MEMBERSHIP ACCOUNT");
		return true;
	}
}
