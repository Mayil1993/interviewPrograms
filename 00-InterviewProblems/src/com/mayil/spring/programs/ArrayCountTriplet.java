package com.mayil.spring.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayCountTriplet {

	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
	List<Integer> list =	Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.contains(list.get(i)+list.get(j))) {
					sum++;
				}
				
			}
			
		}
		
		
		//impl in streams
		int val = (int) IntStream.range(0, list.size()).flatMap(i -> IntStream.range(i+1, list.size()).filter(j -> list.contains(list.get(i)+list.get(j)))).count();
		
		
		System.out.println(sum);
	}
}
