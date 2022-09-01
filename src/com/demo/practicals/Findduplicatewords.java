package com.demo.practicals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Findduplicatewords {
	public static void findduplicates(String str) 
	{
	
		
		Map<String,Integer> map=new HashMap<>();
		String[] s = str.split(" ");
		
		for(String s1: s)
		{
			if (map.containsKey(s1)) 
			{
				map.put(s1, map.get(s1)+1);
			}
			else
			{
				map.put(s1, 1);
			}
		}
		Set<String> keys = map.keySet();
		for(String c1:keys)
		{
			if (map.get(c1)>1)
			{
				System.out.println(c1+ "......" +map.get(c1));
			}
		}
	}
	public static void main(String[] args) 
	{
		findduplicates("java java selenium javaselenium");
	}
}
 
	
	
		
		
