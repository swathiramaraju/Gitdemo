package com.demo.practicals;

import java.util.Scanner;

public class PatternDemo
{
	public static void main(String[] args)
	{
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("enter a number: ");
		int num = scanner1.nextInt();
		
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
}
}

