package com.jd.risktest.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jd.risktest.helloworld.HelloApi;

public class HelloTest {
	
	@Test
	public void testHelloWorld() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
		//HelloApi helloApi = context.getBean("hello", HelloApi.class);
		//helloApi.sayHello();

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloworld.xml");
		//��ȡ���ݲ�����������ע���Bean  
		HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);  
		byIndex.sayHello();  
		//��ȡ���ݲ�����������ע���Bean  
		HelloApi byType = beanFactory.getBean("byType", HelloApi.class);  
		byType.sayHello();  
		//��ȡ���ݲ�����������ע���Bean  
		HelloApi byName = beanFactory.getBean("byName", HelloApi.class);  
		byName.sayHello(); 
		
		//��ȡ����ʵ��
		HelloApi byNamefactory = beanFactory.getBean("byNameFactory", HelloApi.class);  
		byNamefactory.sayHello(); 
		
		//��ȡ���ݲ�����������ע���Bean  
		HelloApi byProperty = beanFactory.getBean("byProperty", HelloApi.class);  
		byProperty.sayHello(); 
		
		//ͨ��setter��ʽע��  
	    HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);  
	    bean2.sayHello();  
	}
}
