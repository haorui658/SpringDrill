package com.jd.risktest.beanannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TestAnnotationBean {

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
	private TestAnnotationBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
