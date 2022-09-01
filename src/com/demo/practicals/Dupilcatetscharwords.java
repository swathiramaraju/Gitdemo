package com.demo.practicals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dupilcatetscharwords {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("a");
		Matcher matcher = pattern.matcher("java is easy ");
		int count =0;
		while (matcher.find()){
			count++;
		}
		System.out.println("no of occurences of a is:"+count);
	}

}
