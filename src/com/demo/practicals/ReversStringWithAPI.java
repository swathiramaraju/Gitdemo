package com.demo.practicals;

import java.util.Scanner;

public class ReversStringWithAPI {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the string");
		String s = scanner.nextLine();
		String reverse = " ";
		
	reverse= new StringBuffer(s).reverse().toString();
	System.out.println("Reverse of string is :"+reverse);
	}

}
