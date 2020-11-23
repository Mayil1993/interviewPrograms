package com.mayil.spring.programs;

import java.util.Scanner;

public class ColumnNameForGivenColumn {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			String result = "";
			int value = sc.nextInt();	
			
		    while (value > 0) {
		    	value--;
		        result = (char)('A' + value%26) + result;
		        value /= 26;
		    }
			
			System.out.println(result);
		}
		
	}
}
