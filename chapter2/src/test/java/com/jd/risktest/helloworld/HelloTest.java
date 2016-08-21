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
		//获取根据参数索引依赖注入的Bean  
		HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);  
		byIndex.sayHello();  
		//获取根据参数类型依赖注入的Bean  
		HelloApi byType = beanFactory.getBean("byType", HelloApi.class);  
		byType.sayHello();  
		//获取根据参数名字依赖注入的Bean  
		HelloApi byName = beanFactory.getBean("byName", HelloApi.class);  
		byName.sayHello(); 
		
		//获取工厂实例
		HelloApi byNamefactory = beanFactory.getBean("byNameFactory", HelloApi.class);  
		byNamefactory.sayHello(); 
		
		//获取根据参数名字依赖注入的Bean  
		HelloApi byProperty = beanFactory.getBean("byProperty", HelloApi.class);  
		byProperty.sayHello(); 
		
		//通过setter方式注入  
	    HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);  
	    bean2.sayHello();  
	}
}
