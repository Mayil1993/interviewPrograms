package com.mayil.spring.programs;

import java.util.Scanner;

public class RectangleOverlap {

	public static void main(String[] args) {
		
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int x[]=new int[5],y[]=new int[5];
		    for(int i=1;i<=4;i++)
		    {
		        x[i]=sc.nextInt();y[i]=sc.nextInt();
		    }
		    
		    if(x[1]>x[4]||x[2]<x[3]||y[1]<y[4]||y[2]>y[3]) System.out.println("0");
		    else System.out.println("1");
		
	}
	}
}
