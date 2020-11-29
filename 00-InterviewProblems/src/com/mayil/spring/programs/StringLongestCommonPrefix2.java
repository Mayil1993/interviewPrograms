package com.mayil.spring.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringLongestCommonPrefix2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int str = sc.nextInt();
			 String s="";
		        s= sc.nextLine();
		        s+=sc.nextLine();
		        
		        String[] arr = s.split(" ");
		        
		        if(arr.length ==1) {
		        	System.out.println(arr[0]);
		        }else {
		        	List<String> collect = Arrays.stream(arr).sorted().collect(Collectors.toList());
		        	
		        	
		        	// sort the array
		        	//find element with min length between collect.get(0) and collect.get(collect.size()-1)
		        	//check if max element startswith min element if true break
		        	//else reduce 1 string in mn element and repeat step 3
		        	
		       
		        }
		        
		       
		}
	}
}
