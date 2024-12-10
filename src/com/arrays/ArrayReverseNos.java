package com.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayReverseNos {

	public static void main(String[] args) {
		int[] rev= {2,3,4,6,8};
		
		System.out.println(Arrays.toString(rev));
		
		reverseNum(rev);
		
		System.out.println(Arrays.toString(rev));
			
	}

	static void reverseNum(int[] rev) 
	{
		for (int s = 0,e=rev.length-1; s < rev.length; ) 
		{
			int temp=rev[s];
			rev[s]=rev[e];
			rev[e]=temp;
			s++;
			e--;
		}
		
		
				
		
				
	}

}
