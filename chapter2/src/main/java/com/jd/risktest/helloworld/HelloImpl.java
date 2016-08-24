package com.jd.risktest.helloworld;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloImpl implements HelloApi {

	@Autowired
	public HelloImpl(String message, int index) {
		this.message = message;
		this.index = index;
	}

	public HelloImpl() {
		this.message ="空构造参数";
	}

	private String message;
	private int index;

	public void setMessage(String message) {
		this.message = message;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println(message);
	}

}
