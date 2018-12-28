package com.test.threads;

public class Data {
private String message;

public Data(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	System.out.println("Data is being sent");
}

}
