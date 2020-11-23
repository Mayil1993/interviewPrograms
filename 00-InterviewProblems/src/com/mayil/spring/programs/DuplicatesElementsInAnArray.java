package com.mayil.spring.programs;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesElementsInAnArray {

	
	public static void main(String[] args) {
		
		int a[] = {1,4,4,2,3,3,2,4};

		
		ArrayList<Integer> duplicates1 = (ArrayList<Integer>) java.util.stream.IntStream.of( a )
			       .boxed()
			       .collect( java.util.stream.Collectors.groupingBy( java.util.function.Function.identity(), java.util.stream.Collectors.counting() ) )
			       .entrySet()
			       .stream()
			       .filter( p -> p.getValue() > 1 )
			     //  .sorted(Map.Entry.comparingByKey())
			       .map( Map.Entry::getKey )
			       .collect(java.util.stream.Collectors.toList());
		
		System.out.println(duplicates1.isEmpty() ? (ArrayList<Integer>)Stream.of(-1).collect(Collectors.toList()) : duplicates1);
	}
}
