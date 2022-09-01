package com.demo.practicals;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates { // in array
public static void main(String[] args) {
	int[] a = {12,45,60,12,60,12,14,16,17,16,17,14};
	
	Set<Integer> set = new HashSet<>();
	for(Integer i : a){
		set.add(i);
	}
	System.out.println(set);
}
}
