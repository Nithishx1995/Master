package com.arrays;

public class VowelCheckSolution {

	public static void main(String[] args) {
		String vowel="Nithish";
		vowel=vowel.toLowerCase();
		vowelCheck(vowel);
		

	}

	static void vowelCheck(String vowel) {
		StringBuilder sb=new StringBuilder(vowel);
		
		for (int i = 0; i < vowel.length(); i++) 
		{
			if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u')
			{
				System.out.println("Vowels are present hence breaking...");
				break;
			}
			
		}
		
		
	}

}
