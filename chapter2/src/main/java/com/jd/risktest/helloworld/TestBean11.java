package com.jd.risktest.helloworld;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean11 {

	@Autowired //�ֶ�ע��  
	private String name;  
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String message;

	@Autowired // ������ע��
	private TestBean11(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
