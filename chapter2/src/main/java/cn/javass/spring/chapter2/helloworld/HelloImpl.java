package cn.javass.spring.chapter2.helloworld;

public class HelloImpl implements HelloApi {

	public HelloImpl(String message, int index) {
		this.message = message;
		this.index = index;
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
