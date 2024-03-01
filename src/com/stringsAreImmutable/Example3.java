package com.stringsAreImmutable;

public class Example3 {

	public static void main(String[] args) {
		
		System.out.println("==================immutable strings===================");
		String name = "Raj";
		
		System.out.println(name);
		
		System.out.println("--------------------------");
		
		name.concat(" Kumar");//new value added to existing string "Raj"
		
		System.out.println(name);
		
		System.out.println("==================mutable strings===================");
		
		//StringBuffer and StringBuilder classes to create mutable string objects
		StringBuilder myName = new StringBuilder("Raj");
		System.out.println(myName);
		
		System.out.println("--------------------------");
		
		myName.append(" Kumar");		
		System.out.println(myName);

	}

}
