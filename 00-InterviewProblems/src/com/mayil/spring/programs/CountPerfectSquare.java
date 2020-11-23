package com.mayil.spring.programs;

import java.util.stream.IntStream;

public class CountPerfectSquare {
	
	public static void main(String[] args) {
		
		int n = 9;
		System.out.println(IntStream.rangeClosed(1, (int)Math.sqrt(n)).filter(i -> i*i < n).count());
	
	}

}
