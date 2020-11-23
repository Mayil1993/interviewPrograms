package com.mayil.spring.programs;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringPermutation {

	private static Set<String> set;
	
	public static void permutation(String str) {
        permutation("", str);
    }
	
	private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            set.add(prefix);
        } else {
            IntStream.range(0, n).parallel()
                    .forEach(i -> permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n)));
        }
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- > 0)
		{
			set = new ConcurrentSkipListSet<String>();
			String value = sc.next();
			 permutation(value);
			 System.out.println(String.join(" ", set));
		//	 System.out.println(set.stream().collect(Collectors.joining(" "))); //Both will work
		}
		
	}
	
	
}
