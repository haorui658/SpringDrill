package com.jd.risktest.aopannotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class HelloAopAspect {
	// ǰ��֪ͨ
	
	@Before("execution(* com.jd..*.*(..))")
	public void beforeAdvice() {
		System.out.println("===========before advice");
	}

	// ��������֪ͨ
	@After("execution(* com.jd..*.*(..))")
	public void afterFinallyAdvice() {
		System.out.println("===========after finally advice");
	}
}
