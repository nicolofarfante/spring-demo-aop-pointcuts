package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {	
	
	// reuse Pointcuts in Advices
	
	@Before("com.luv2code.aopdemo.aspect.UtilityForHoldingPointcutExpressions.firstPointcut()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n =====> Executing BeforeAddAccountAdvice");
		
		// JOINPOINTS:
		
		// display method signature
		
		MethodSignature methodSig = (MethodSignature) joinPoint.getSignature();
		System.out.println("method: " + methodSig);
		
		// display method arguments
		
		Object[] args = joinPoint.getArgs();
		
		for(Object arg:args) {
			System.out.println(arg);
			
			if(arg instanceof Account) {
				
				// downcast and print Account specific stuff
				Account account = (Account) arg;
				
				System.out.println("Account name: " + account.getName());
				System.out.println("Account level: " + account.getLevel());
				
			}
		}
	}
	
}
