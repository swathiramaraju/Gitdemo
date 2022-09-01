package com.demo.practicals;

import java.util.HashMap;
import java.util.Set;

public class ReapativeWordCountDemo {
	public static void main(String[] args) {
		wordcount(";cat dog dog cat pen pencil pencil pen");
		wordcount("AAA BBB CCC AAA BBB DDD EEE");
		
	}
	public static void wordcount(String str) {
		HashMap<String,Integer > hmp = new HashMap<String,Integer>();
		String[]array=str.split("\\s+");
				for (String s:array)
				{ 
			if(hmp.containsKey(s))
			{
				hmp.put(s, hmp.get(s)+1);
			}else
			{
				hmp.put(s, 1);
			}
			
			}
				Set<String> keySet = hmp.keySet();
				for (String key:keySet)
				{
					if(hmp.get(key)>1){
						System.out.println("duplicate word is: "+key +"occured" +hmp.get(key) +"times");
					}
			}
	}
	
}
