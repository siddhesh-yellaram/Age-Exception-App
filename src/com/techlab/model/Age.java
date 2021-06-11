package com.techlab.model;

public class Age {
	private int id;
	private String name;
	private int age;
	
	public Age(int id, String name, int age) throws InsufficientAge {
		this.id = id;
		this.name = name;
		this.age = validateAge(age);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	private int validateAge(int age) throws InsufficientAge {
		if(age > 18) {
			return age;
		}else {
			throw new InsufficientAge(this, age);
		}
	}
	
}
