package com.demo.practicals;

import java.util.Scanner;

public class RemoveWhiteSpacesDemo {
public static void main(String[] args) {
	
	Scanner scanner12 = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = scanner12.nextLine();
	
	str=str.replaceAll("\\s", "");
	System.out.println(str);
}
}
