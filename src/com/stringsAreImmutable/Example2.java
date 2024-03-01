package com.stringsAreImmutable;

public class Example2 {

	public static void main(String[] args) {
		
		System.out.println("==================immutable strings===================");
		String name = "Raj";
		
		System.out.println(name);
		
		System.out.println("--------------------------");
		
		name.concat(" Kumar");//new value added to existing string "Raj"
		
		System.out.println(name);
		
		System.out.println("==================mutable strings===================");
		
		//StringBuffer and StringBuilder classes to create mutable string objects
		StringBuffer myName = new StringBuffer("Raj");
		System.out.println(myName);
		
		System.out.println("--------------------------");
		
		myName.append(" Kumar");		
		System.out.println(myName);

	}

}
