package com.mayil.spring.programs;

import java.util.HashMap;

public class StringRomanNumberToInteger {

	public static void main(String[] args) {
		
		String pRomanNumeral = "XIX";
		HashMap<Character, Integer> map = new HashMap<>();
	    map.put('I', 1);
	    map.put('V', 5);
	    map.put('X', 10);
	    map.put('L', 50);
	    map.put('C', 100);
	    map.put('D', 500);
	    map.put('M', 1000);
	    
	   
	        int index = pRomanNumeral.length() - 1;
	        int result = map.get(pRomanNumeral.charAt(index));

	        for (int i = index - 1; i >= 0; i--) {
	          if (map.get(pRomanNumeral.charAt(i)) >= map.get(pRomanNumeral.charAt(i + 1))) {
	            result = result + map.get(pRomanNumeral.charAt(i));
	          }
	          else {
	            result = result - map.get(pRomanNumeral.charAt(i));
	          }
	        }   
	        System.out.println(result);
	}
}
