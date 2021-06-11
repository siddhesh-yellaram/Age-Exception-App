package com.techlab.model;

public class InsufficientAge extends Exception {
	private Age a1;
	private String msg;
	private int studAge;
	
	public InsufficientAge(Age a, int age) {
		this.a1 = a;
		this.studAge = age;
	}
	
	@Override
	public String getMessage() {
		setMessage();
		return msg;
	}
	
	public void setMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("Age is less than 18 for: ");
		sb.append("\nStudent Id: ");
		sb.append(a1.getId());
		sb.append("\nStudent Name: ");
		sb.append(a1.getName());
		sb.append("\nStudent Age: ");
		if(a1.getAge() > 18) {
			sb.append(a1.getAge());
		}else {
			sb.append(studAge);
		}
		msg = sb.toString();
	}
}
