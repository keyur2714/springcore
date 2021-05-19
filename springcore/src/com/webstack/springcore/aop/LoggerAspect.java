package com.webstack.springcore.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggerAspect {

	@Pointcut("execution(* com.webstack.springcore.bean.Message.getMessage(..))")
	public void loggableMethods() {
	}

	@Pointcut("execution(* com.webstack.springcore.service.impl.EmployeeServiceImpl.*(..))")
	public void loggableServiceMethods() {
	}
	
	@Before("@annotation(com.webstack.springcore.aop.Loggable)")
	public void general()  {
		System.out.println("Hello It's Annotaion Advice...");
	}

	@Before("loggableServiceMethods()")
	public void beforeMsg(JoinPoint joinPoint) {
		System.out.println("Method Started. " + System.currentTimeMillis() + " " + joinPoint.getSignature().getName());
	}

	@After("loggableServiceMethods()")
	public void afterMsg(JoinPoint joinPoint) {
		System.out.println("Method End. " + System.currentTimeMillis() + " " + joinPoint.getSignature().getName());
	}

	@Around("execution(* com.webstack.springcore.service.impl.ExamServiceImpl.*(..))")
	public Object logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName()
				+ ": Before Method Execution");
		Object o = null;
		try {
			o = joinPoint.proceed();			
			System.out.println(" *** "+o.toString()+" *** ");
			o = "Result is "+o.toString();
		} finally {
			// Do Something useful, If you have
		}
		System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName()
				+ ": After Method Execution");
		return o;
	}

}
