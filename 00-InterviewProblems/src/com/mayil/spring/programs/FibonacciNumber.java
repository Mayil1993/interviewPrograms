package com.mayil.spring.programs;

import java.util.stream.Stream;

public class FibonacciNumber {

	public static void main(String[] args) {
		
	long num =	Stream.iterate(new long[] {1, 1}, f -> new long[] {f[1], f[0] + f[1]})
	    .limit(2)
	    .reduce((a, b) -> b)
	    .get()[0];
	
	System.out.println(num);
	
    
	}
}
