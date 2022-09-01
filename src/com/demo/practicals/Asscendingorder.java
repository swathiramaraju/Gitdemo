package com.demo.practicals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Asscendingorder {
	public static void main(String[] args) {
		int [] a ={23,45,65,75,83};
		List<Integer> list = new ArrayList<>();
		for(int i :a)
		{
			list.add(i);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		/*Arrays.sort(a);
		for (Integer i : a)
		{
			System.out.println(a);
			
		}
		*/
		
		
		/*TreeSet<Integer> ts = new TreeSet<>();
		for (Integer i : a)
		{
			ts.add(i);
			
		}
		
		 System.out.println(ts);*/
	}

}
