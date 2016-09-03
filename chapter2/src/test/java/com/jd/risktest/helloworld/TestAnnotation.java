package com.jd.risktest.helloworld;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("TestAnnotation.xml");

	/**
	 * �о�����������ƻ��Զ�װ�䣬û�о�������ƻ�ƥ��������ͣ�ƥ�䵽һ�������Զ�װ�䣬ƥ�䵽����ᱨ��
	 */
	@Test
	public void testAutowiredForConstructor() {

		TestAnnotationBean testBean11 = ctx.getBean("testBean11", TestAnnotationBean.class);
		System.out.println(testBean11.getMessage());
		Assert.assertEquals("hello", testBean11.getMessage());
	}
	
	@Test
	public void testAutowiredForField() {

		TestAnnotationBean testBean11 = ctx.getBean("testBean11", TestAnnotationBean.class);
		System.out.println(testBean11.getName());
		Assert.assertEquals("Hellofromproperties:My Name is CoCo", testBean11.getName());
	}
}
