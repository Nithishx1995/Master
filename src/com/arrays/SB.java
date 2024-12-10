package com.arrays;

import java.util.Arrays;

public class SB {

	public static void main(String[] args) {
//		String n="Nithish NAREN";
//		System.out.println(Arrays.toString(n.split("")));
		String b=new String("Malayalam");
		boolean p=palin(b);
		System.out.println(p);

	}

	static boolean palin(String b) {
		
		for (int i = 0; i < b.length()/2; i++) 
		{
			b=b.toLowerCase();
			char start=(char)b.charAt(i);
			char end=(char)b.charAt(b.length()-1-i);
			if(start==end)
			{
				start++;
				end--;
			}
			else 
				return false;
		}
		return true;
	}

}
