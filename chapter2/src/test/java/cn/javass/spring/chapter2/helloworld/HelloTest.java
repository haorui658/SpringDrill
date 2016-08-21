package cn.javass.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
	}
}
