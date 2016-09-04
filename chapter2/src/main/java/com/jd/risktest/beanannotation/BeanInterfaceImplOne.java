package com.jd.risktest.beanannotation;

import org.springframework.stereotype.Component;

@Component
public class BeanInterfaceImplOne implements BeanInterface {

	@Override
	public void sayName() {
		System.out.println(this.getClass().getName());

	}

}
