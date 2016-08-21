
package com.jd.risktest.helloworld;

import com.jd.risktest.helloworld.HelloApi;

public class DependencyInjectByStaticFactory {
	public static HelloApi newInstance(String message, int index) {
		return new HelloImpl(message, index);
	}
}