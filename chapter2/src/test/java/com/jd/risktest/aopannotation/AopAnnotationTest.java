package com.jd.risktest.aopannotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AopAnnotationTest {

	@Test
	public void AnnotationTest(){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AopAnnotation.xml");
		IHelloWorldService helloworldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
		helloworldService.sayHello();
	}
}
