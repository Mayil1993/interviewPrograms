package com.mayil.spring.programs;

import java.util.Scanner;

public class ArraySubArrayWithGivenSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int[] arr = new int[sc.nextInt()];
			int target = sc.nextInt();
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			int sum = 0;
			boolean flag = false;
			for(int start=0,end=0;start<arr.length && end < arr.length;) {
				if(arr[end]+sum == target) {
					flag = true;
					start++;
					end++;
					System.out.println(start+" "+end);
					break;
				}
				if(arr[end]+sum < target) {
					sum += arr[end];
					end++;
					continue;
				}
				if(arr[end]+sum > target) {
					sum -= arr[start];
					start++;
					continue;
				}
				
			}
			if(!flag) {
				System.out.println(-1);
			}
		}
	}
	
	/*
	 * we keep on incrementing end pointer while adding the element in the current sum until 
	 * we reach a point where our current running sum is more than required target sum, 
	 * this basically means that the current subarray whose sum we’ve calculated is not the right answer
	 * 
	 * 
	 * So now we alter our subarray by moving the start pointer, 
	 * that is shortening the subarray and hence the current sum in the hope 
	 * that we achieve the current sum equal to the required target sum
	 * 
	 * At every point we check if our current sum is equal to target sum or not, if this is the case we print our pointers.
	 * 
	 * 
	 * So basically we are altering the subarray by increasing start and 
	 * end pointers and changing the current sum depending on its value as compared to target sum.
	 */
	
}
