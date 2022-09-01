package com.demo.practicals;

import java.util.Scanner;

public class PositiveOrNegativeDemo {
	public static void main(String[] args) {
		//num greater than 0.0 is  positive
		//num less than 0.0 is negative
		
		double num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		num=scanner.nextDouble();
		if(num>=0.0)
			System.out.println("Number"+num+"is positive number");
		
		else if (num<=0.0)
		
			System.out.println("Number"+num+"is negative number");
		
	}

}
