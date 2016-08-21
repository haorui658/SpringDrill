package com.jd.risktest.helloworld;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTestBean {
	private List<String> values;

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	@Test
	public void testListInject() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("listInject.xml");
		ListTestBean listBean = beanFactory.getBean("listBean", ListTestBean.class);
		System.out.println(listBean.getValues().size());
		Assert.assertEquals(3, listBean.getValues().size());
	}
}
