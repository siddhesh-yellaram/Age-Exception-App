package com.techlab.test;

import com.techlab.model.Age;
import com.techlab.model.InsufficientAge;

public class AgeTest {

	public static void main(String[] args) throws InsufficientAge {
		try {
			Age s1 = new Age(1, "Loki", 19);
			Age s2 = new Age(2, "Thor", 16);
		}catch(InsufficientAge i) {
			System.out.println(i.getMessage());
		}
	}

}
