package com.jd.risktest.beanannotation;

import org.springframework.stereotype.Component;

//@Component("customId")����ͨ���˷�ʽ�Զ���id
@Component
public class BeanAnnotation {

	public void sayHello(String message) {

		System.out.println("from Bean: " + message);

	}
}
