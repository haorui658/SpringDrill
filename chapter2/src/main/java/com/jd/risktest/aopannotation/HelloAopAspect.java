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
	
	// ǰ��֪ͨ	
	@Before("execution(* com.jd.risktest.aopannotation.*.*(..))")
	public void beforeAdvice() {
		System.out.println("===========before advice");
	}

	// ��������֪ͨ
	@After("point()")
	public void afterFinallyAdvice() {
		System.out.println("===========after finally advice");
	}
	
	//����֪ͨ
	@Around("point()")
	public void Around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("�Ѿ���¼�²�����־@Around ����ִ��ǰ");
	        jp.proceed();
	    	System.out.println("�Ѿ���¼�²�����־@Around ����ִ�к�");
		
	}
}
