package com.jd.risktest.helloworld;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("dependecyInjectWithAnnotation.xml");

	/**
	 * �о�����������ƻ��Զ�װ�䣬û�о�������ƻ�ƥ��������ͣ�ƥ�䵽һ�������Զ�װ�䣬ƥ�䵽����ᱨ��
	 */
	@Test
	public void testAutowiredForConstructor() {

		TestBean11 testBean11 = ctx.getBean("testBean11", TestBean11.class);
		System.out.println(testBean11.getMessage());
		Assert.assertEquals("hello", testBean11.getMessage());
	}
	
	@Test
	public void testAutowiredForField() {

		TestBean11 testBean11 = ctx.getBean("testBean11", TestBean11.class);
		System.out.println(testBean11.getName());
		Assert.assertEquals("hello", testBean11.getName());
	}
}
