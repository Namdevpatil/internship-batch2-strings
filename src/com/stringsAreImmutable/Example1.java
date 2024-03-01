package com.stringsAreImmutable;

public class Example1 {

	public static void main(String[] args) {
		
		
		String name = "Raj";
		
		System.out.println(name);
		
		System.out.println("--------------------------");
		
		name.concat(" Kumar");//new value added to existing string "Raj"
		
		System.out.println(name);

	}

}
