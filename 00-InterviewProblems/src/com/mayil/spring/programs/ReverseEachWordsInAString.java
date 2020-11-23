package com.mayil.spring.programs;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseEachWordsInAString {

	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	
	while(t-->0)
	{
		String str = sc.next();
		
		System.out.println(String.join(".", Pattern.compile("\\.+").splitAsStream(str).map(i -> new StringBuilder(i).reverse())
		        .collect(Collectors.toList())));
	}
	}
}
