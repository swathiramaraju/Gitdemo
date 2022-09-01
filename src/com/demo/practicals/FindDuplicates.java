package com.demo.practicals;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicates 
{
	public static void findduplicates(String str) 
	{
	
		
		Map<Character,Integer> map=new HashMap<>();
		char[] ch=str.toCharArray();
		
		for(char c : ch)
		{
			if (map.containsKey(c)) 
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		Set<Character> keys = map.keySet();
		for(char c1:keys)
		{
			if (map.get(c1)>1)
			{
				System.out.println(c1+ "......" +map.get(c1));
			}
		}
	}
	public static void main(String[] args) 
	{
		findduplicates("java java aaaa");
	}
}

