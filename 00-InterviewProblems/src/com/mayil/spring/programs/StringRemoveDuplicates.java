package com.mayil.spring.programs;

public class StringRemoveDuplicates {

	public static void main(String[] args) {
		
		String s = "geeksforGeeks";
		System.out.println(s.toLowerCase().chars().distinct().collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString());;
	}
}
