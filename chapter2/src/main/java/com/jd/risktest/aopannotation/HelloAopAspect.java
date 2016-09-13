package com.jd.risktest.aopannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Aspect
public class HelloAopAspect {	

	@Pointcut("execution(* com.jd..*.*(..))")
	public void point(){
		
	}
	
	// 前置通知	
	@Before("execution(* com.jd.risktest.aopannotation.*.*(..))")
	public void beforeAdvice() {
		System.out.println("===========before advice");
	}

	// 后置最终通知
	@After("point()")
	public void afterFinallyAdvice() {
		System.out.println("===========after finally advice");
	}
	
	//环绕通知
	@Around("point()")
	public void Around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("已经记录下操作日志@Around 方法执行前");
	        jp.proceed();
	    	System.out.println("已经记录下操作日志@Around 方法执行后");
		
	}
}
