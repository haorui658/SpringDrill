package com.jd.risktest.beanannotation;

import org.springframework.stereotype.Component;

//@Component("customId")可以通过此方式自定义id
@Component
public class BeanAnnotation {

	public void sayHello(String message) {

		System.out.println("from Bean: " + message);

	}
}
