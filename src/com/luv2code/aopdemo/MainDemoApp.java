package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// call business method
		
		Account account = new Account();
		account.setName("Nico");
		account.setLevel("Platinum");
		
		accountDAO.addAccount(account, true);
		membershipDAO.addSillyMember();
		accountDAO.setName("Nico");
		accountDAO.setServiceCode("Service for code");
		String name = accountDAO.getName();
		String serviceCode = accountDAO.getServiceCode();
		
		// close context
		
		context.close();
	}

}
