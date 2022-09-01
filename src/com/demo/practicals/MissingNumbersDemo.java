package com.demo.practicals;

import java.util.Arrays;

public class MissingNumbersDemo {
	public static void main(String[] args) {
		int[] ques = {1,1,3,3,5,5,6,8};
		Arrays.sort(ques);
		
		int[] output = new int [ques.length+1];
		for (int i : ques)
		{
			output[i] =1;
			
		}
		for (int i=1;i<output.length;i++)
		{
			if(output[i]==0){
				System.out.println(i);
			}
		}
	}

}
