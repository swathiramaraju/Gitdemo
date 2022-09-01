package com.demo.practicals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dupicatecharwordsdemo 
{

public static void main(String[] args) 
{
		
		Pattern pattern =Pattern.compile("java");
		Matcher matcher = pattern.matcher("java is easy java java ");
		int count = 0;
				while (matcher.find())
{
					count++;
}
		System.out.println("occurence of number a is:"+count);
	
}
}
