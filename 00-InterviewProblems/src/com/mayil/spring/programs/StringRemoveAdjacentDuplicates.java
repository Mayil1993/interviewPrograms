package com.mayil.spring.programs;

import java.util.Scanner;
import java.util.stream.IntStream;

public class StringRemoveAdjacentDuplicates {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			String str = sc.next();
			System.out.println(removeAdjacentDuplicates(str));
		}
	}
	
static String removeAdjacentDuplicates(String input) {
		
	 if(input.length()==0){
	        return "";
	    }
	    if(input.length()==1){
	        return input;
	    }
	    
	String result =	IntStream.rangeClosed(0, input.length()-1)
		.filter(i -> i == 0 ? input.charAt(i) != input.charAt(i + 1) : i == input.length()-1 ? input.charAt(i) != input.charAt(i - 1) : input.charAt(i) != input.charAt(i - 1) && input.charAt(i) != input.charAt(i + 1) )
		.mapToObj(i -> input.charAt(i))
        .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
	
	if(input.equals(result)) {
		return result;
	}else {
		return removeAdjacentDuplicates(result);
	}
	}
}
