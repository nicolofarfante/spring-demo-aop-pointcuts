package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class UtilityForHoldingPointcutExpressions {

		// create Pointcut for reuse
	
		@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
		public void firstPointcut() {}
		
		// create other Pointcuts for combining
		
		@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
		public void getterPointcut() {}
		@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
		public void setterPointcut() {}
		
		// combine into another Pointcut
		
		@Pointcut("firstPointcut() && !(getterPointcut() || setterPointcut())") // excluding all getter and setter methods
		public void firstPointcutNoGetterNoSetter() {}

}
