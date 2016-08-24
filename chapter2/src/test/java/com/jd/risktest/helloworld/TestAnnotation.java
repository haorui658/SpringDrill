package com.jd.risktest.helloworld;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("dependecyInjectWithAnnotation.xml");

	/**
	 * 有具体变量的名称会自动装配，没有具体的名称会匹配变量类型，匹配到一个，则自动装配，匹配到多个会报错
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
