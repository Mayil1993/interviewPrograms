package com.mayil.spring.programs;

import java.util.Arrays;
import java.util.Scanner;

public class StringLongestCommonPrefix {

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
		        
		        String shot = arr[0];
		        int length = shot.length();
		        while(length >0) {
		        	shot = shot.substring(0, length);
		        	boolean flag = true;
		        	for(int i=0;i<arr.length;i++) {
				    	   if(!arr[i].startsWith(shot)) {
				    		   flag = false;
				    		   break;
				    	   }
				       }
		        	if(flag) {
		        		System.out.println(shot);
		        		break;
		        	}
		        	if(length == 1) {
		        		System.out.println(-1);
		        		break;
		        	}
		        	length--;
		        }
		       
		}
	}
}
