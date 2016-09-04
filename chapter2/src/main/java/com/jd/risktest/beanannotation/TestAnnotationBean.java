package com.jd.risktest.beanannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TestAnnotationBean {

	@Autowired //字段注入  
	private String name;  
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String message;

	@Autowired // 构造器注入
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
