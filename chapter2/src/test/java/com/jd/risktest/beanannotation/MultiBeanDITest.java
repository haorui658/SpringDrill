package com.jd.risktest.beanannotation;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MultiBeanDITest {

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("TestAnnotation.xml");
	@Test
	public void testMultiBeanDI() {

		BeanInvoker testBean11 = ctx.getBean("beanInvoker", BeanInvoker.class);
		testBean11.testDI();
	}

}
