package com.demo.practicals;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("enter a number: ");
		int num = scanner1.nextInt();
		for(int i=0;i<num;i++)
		{
		for(int j=num-i;j>1;j--)
		{
		 System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
		   System.out.print("$ ");
		}
		System.out.println();
			
		}

	}
	
}

