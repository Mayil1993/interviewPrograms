package com.mayil.spring.programs;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String s = "zxvczbtxyzvycb";
		
		final Optional<Character> optionalCharacter = s.chars().mapToObj(i -> (char) i)
				          .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				          .entrySet().stream().filter(entry -> entry.getValue() == 1L)
				          .map(entry -> entry.getKey())
			              .findFirst();
		
		System.out.println(optionalCharacter.orElse('$'));
	}
	
	/*
	 * 
	 * String str = "zzzzzbbbccccddehhhhiii";
		int[] countingArray = new int[128];
		str.chars().forEach(value -> countingArray[value]++);
		int nonRepeatingCharAsInt = 0;
			for (int i = 0; i < countingArray.length; i++) {
    			if (countingArray[i] == 1) {
        			nonRepeatingCharAsInt = i;
        			break;
    			}
		}
			System.out.println("character = " + Character.valueOf((char) nonRepeatingCharAsInt));
	 * 
	 */
}
