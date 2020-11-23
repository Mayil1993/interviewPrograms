package com.mayil.spring.programs;

import java.util.stream.IntStream;

public class SearchAnElementInAnArray {

	int[] arr = {1,2,3,4};
	int x = 2;
	int n = IntStream.range(0, arr.length).filter(i -> arr[i] == x).findFirst().orElse(-1);
}
