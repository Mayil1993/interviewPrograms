package com.mayil.spring.programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysMissingNumberInArray {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6,7,8,10};
		int n = 10;
		
		int sum = Arrays.stream(array).sum();
		
		int total = ((n+1)*n)/2;
		
		System.out.println(total-sum);
		
		
	}
}
