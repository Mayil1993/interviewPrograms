package com.mayil.spring.programs;

import java.util.Arrays;

public class EqualArrays {

	public static void main(String[] args) {
		
		int A[] = {4,2};
		int B[] = {2,4,15};
		
		Arrays.parallelSort(A);
		Arrays.parallelSort(B);
		
		boolean flag = Arrays.equals(A, B);
		System.out.println(flag);
	}
}
