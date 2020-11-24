package com.mayil.spring.programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class StringMinInsertionsToMakeAStringPalindrome {

	public static boolean isPalindromeUsingIntStream(String text) {
	    String temp  = text.replaceAll("\\s+", "").toLowerCase();
	    return IntStream.range(0, temp.length() / 2)
	      .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- > 0)
		{
			String value = sc.next();
//			if(isPalindromeUsingIntStream(value)) {
//				System.out.println(0);
//			}else {
//				for(int i=value.length()-1;i>=0;i--) {
//					String appendString = new StringBuilder(value.substring(i)).reverse().toString();
//					System.out.println(appendString);
//					if(isPalindromeUsingIntStream(appendString+value)){
////						System.out.println(value.length()-i);
//						System.out.println(appendString.chars().distinct().count());
////						System.out.println(removeAdjacentDuplicates(appendString).length());
//						break;
//					}
//				}
//			}
			System.out.println(value.length() - findLongestPalindromicSubstring(value).length());
		}
		
	}
	
	static String removeAdjacentDuplicates(String input) {
		
		StringBuilder sb = new StringBuilder();
	    sb.append(input.charAt(0));
	    
		IntStream.range(1, input.length())
        .mapToObj(i -> input.charAt(i) != input.charAt(i - 1) ? input.charAt(i) : "")
        .forEach(sb::append);
		
		return sb.toString();
	}
	
	
	 private static String findLongestPalindromicSubstring(String input) {
		    if(input.isEmpty()) {
		      return "";
		    }
		    int n = input.length();
		    int longestSoFar = 0, startIndex = 0, endIndex = 0;
		    boolean[][] palindrom = new boolean[n][n];
		  
		    for(int j = 0; j < n; j++) {
		      palindrom[j][j] = true;
		      for(int i = 0; i < j; i++) {
		        if(input.charAt(i) == input.charAt(j) && (j-i <= 2 || palindrom[i+1][j-1])) {
		          palindrom[i][j] = true;
		          if(j-i+1 > longestSoFar) {
		            longestSoFar = j-i+1;
		            startIndex = i;
		            endIndex = j;
		          }  
		        }
		      }
		    }
		    
		    System.out.println(input.substring(startIndex, endIndex+1));
		    return input.substring(startIndex, endIndex+1);
		  }
}
