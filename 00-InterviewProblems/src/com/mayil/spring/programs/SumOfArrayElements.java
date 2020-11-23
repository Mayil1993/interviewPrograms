package com.mayil.spring.programs;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int size = sc.nextInt();
			int sum = 0;
			for(int i=0;i<size;i++) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
		}
	}
}
