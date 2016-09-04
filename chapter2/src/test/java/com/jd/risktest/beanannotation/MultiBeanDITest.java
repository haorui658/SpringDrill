package com.jd.risktest.beanannotation;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultiBeanDITest {

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("TestAnnotation.xml");

	@Test
	public void testMultiBeanDI() {

		BeanInvoker beanInvoker = ctx.getBean("beanInvoker", BeanInvoker.class);
		beanInvoker.testDI();
		beanInvoker.QualifierTest();

		System.out.println("@BeanªÒ»°");
		BeanInterface beanInterface = (BeanInterface) ctx.getBean("getBeanInterface");
		System.out.println(beanInterface.getClass().getName());
		BeanInterface beanInterface2 = (BeanInterface) ctx.getBean("BeanInterface2");
		System.out.println(beanInterface2.getClass().getName());
	}

}
