package com.javaStringObjectsCreation;

public class Example1 {

	public static void main(String[] args) {
		//1. using 'new' keyword.
		
		String value1 = new String("India");
		String value2 = new String("India");
		String value3 = new String("USA");
		
		System.out.println(value1 == value2);
		System.out.println(value1 == value3);

	}

}
