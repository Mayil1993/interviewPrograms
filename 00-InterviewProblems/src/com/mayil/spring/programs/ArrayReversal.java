package com.mayil.spring.programs;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayReversal {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int size = sc.nextInt();
			int[] array = new int[size];
			for(int i=0;i<size;i++) {
				array[i]= sc.nextInt();
			}
			
	String result = IntStream.rangeClosed(1, array.length)
		      .mapToObj(i -> String.valueOf(array[array.length - i])).collect(Collectors.joining(" "));

		System.out.println();
		}
	}
}
