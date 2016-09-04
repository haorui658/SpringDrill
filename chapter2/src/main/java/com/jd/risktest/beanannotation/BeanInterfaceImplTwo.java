package com.jd.risktest.beanannotation;

import org.springframework.stereotype.Component;

@Component
public class BeanInterfaceImplTwo implements BeanInterface {

	@Override
	public void sayName() {
		System.out.println(this.getClass().getName());

	}

}
