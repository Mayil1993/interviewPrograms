package com.mayil.spring.programs;

import java.util.LinkedList;
import java.util.regex.Pattern;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String s1  = "this.is.an.example";
		
		String chars = String.join(".", Pattern.compile("\\.+").splitAsStream(s1)
		        .collect(LinkedList::new, LinkedList::addFirst, (a,b)->a.addAll(0, b)));
		
		System.out.println(chars);
	}
	
	
	
}
