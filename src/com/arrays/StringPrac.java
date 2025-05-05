package com.arrays;

import java.util.Arrays;

public class StringPrac {

	public static void main(String[] args) {
		
		String s="accbbd";
		char end=5;
//		char[] newS=s.toCharArray();
//		s=Arrays.toString(newS);
		
		
		reverse1(s);
		
		
		
	}

	static void reverse1(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		
		char[] newS=s.toCharArray();
		s=Arrays.toString(newS);
		System.out.println(s);
		//sSystem.out.println(sb.getChars(1,2,3,4));
//		StringBuilder sb = new StringBuilder(s);
//		
//		System.out.println(sb.reverse());
		
//		for (int i = 0; i < .length(); i++) {
//			for (int j = s.length()-1; j > 0; j--) 
//			{
//				
//				int temp=s[i];
//				s[i]=s[j];
//				s[j]=temp;
//				
//			}
			
		}
		
	}
	


