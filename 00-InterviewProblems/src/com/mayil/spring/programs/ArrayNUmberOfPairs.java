package com.mayil.spring.programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayNUmberOfPairs {

	public static void main(String[] args) {
		
		int[] x = {2, 1, 6} ;
		int[] y = {1, 5};
		
		
		Arrays.parallelSort(y);
		Arrays.parallelSort(x);
		
		long sum =0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				
				if(x[i] == 0) {
					break;
				}
				else if(x[i]==1) {
					
					if( y[j]==0)
						sum++;
					else
						break;
				}
				else if(y[j]==1 ) {
					if(x[i]>1) {
					sum += x.length - i;
					break;
					}else {
						continue;
					}
				}
				else if(x[i]==2 && (y[j]==3 || y[j]==4)) {
					if(Math.pow(x[i], y[j]) > Math.pow(y[j],x[i])) {
						sum++;
					}
				}else if(x[i]==3 && (y[j]==2)) {
					sum++;
				}
				else if(y[j] > x[i]) {
					sum++;
				}else {
					break;
				}
				
			}
		}
		System.out.println(sum);
	}
	
	/*
	 * The trick to this question is if y > x, then then x^y > y^x with some exceptions.

Simply sort the array Y[], and for every element x in X[], find the index idx of smallest number just greater than x in Y[]. 
All the elements after, this index idx satisfy the above relation. So add (n - idx) to the ans.

But as we mentioned there are some exceptions. Try to think of these exceptions.

Following are the exceptions :

if x = 0, then count for this is 0.
 if x = 1, then count is total no of 0s in Y[] only.
if x = 2, for y = 3, y = 4, the above property does not hold, and the count should be decreased
if x = 3, for x = 2, the count need to be inreased
This is the complete solution.
The overall time complexity is O(nlong + mlogn)
	 */
}
