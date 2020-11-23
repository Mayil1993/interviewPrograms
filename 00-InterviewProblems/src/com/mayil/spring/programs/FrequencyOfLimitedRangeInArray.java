package com.mayil.spring.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfLimitedRangeInArray {

	public static void main(String[] args) {
		
		int[] arr = {4,5,2,5,1};
		int n = 5;
		
		System.out.println(String.join(" ",IntStream.rangeClosed(1, n)
				 .map(i -> Collections.frequency(Arrays.stream(arr).boxed().collect(Collectors.toList()), i))
				 .mapToObj(String::valueOf)
				 .collect(Collectors.toList())));
		
		
		/*
		 * 
		 *  for (int j =0; j<n; j++) 
            arr[j] = arr[j]-1; 
        
        // storing the frequency of elements using mathematical formula
        for (int i=0; i<n; i++) 
            arr[arr[i]%n] = arr[arr[i]%n] + n; 

        //taking out frequency of each element
        for (int i =0; i<n; i++) 
            arr[i] = (arr[i]/n);
		 */
		
	}
}
