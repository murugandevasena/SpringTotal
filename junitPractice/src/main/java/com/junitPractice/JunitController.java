package com.junitPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JunitController {
	
public long findMax(int[] a) {
	 
	List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
	long num = list.stream().max(Comparator.comparing(Integer::intValue)).get();
	return num;
	
}

}
