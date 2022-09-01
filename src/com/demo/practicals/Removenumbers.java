package com.demo.practicals;

import java.util.ArrayList;
import java.util.List;

public class Removenumbers {
	public static void main(String[] args) {
		String s = "Java1 selenium1 practices3";
		
		char[] ch = s.toCharArray();
		List<Character> list = new ArrayList<>();
		 for (Character c: ch )
		 {
			 if(!Character.isDigit(c))
			 {
				 list.add(c);
				 
				 
				 
			 }
		 }
		 System.out.println(list);
	}
	

}
