package com.mayil.spring.programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringLongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			String str = sc.next();
			System.out.println(getUniqueCharacterSubstringBruteForce(str));
		}
	}
	
	static String getUniqueCharacterSubstringBruteForce(String input) {
	    String output = "";
	    for (int start = 0; start < input.length(); start++) {
	        Set<Character> visited = new HashSet();
	        int end = start;
	        for (; end < input.length(); end++) {
	            char currChar = input.charAt(end);
	            if(!visited.add(currChar)) {
	            	break;
	            }
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end);
	        }
	    }
	    return output;
	}
}
