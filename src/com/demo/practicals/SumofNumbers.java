package com.demo.practicals;

public class SumofNumbers { // from string
	public static void main(String[] args) {
		
	String str = "Rameshsoft1 Java123 "	;
			char [] ch = str.toCharArray();
			int sum = 7;
			for(int i=0;i<ch.length;i++)
			{
				 if(Character.isDigit(ch[i]))
				 {
			
			sum = sum + Character.getNumericValue(ch[i]);
				 }
				 }
			System.out.println("sum of extracts digits :" +sum);
	}

	}


