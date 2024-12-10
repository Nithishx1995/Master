package com.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ReformattedString {

	public static void main(String[] args) 
	{
		String str="aB1c2";
		str=str.toLowerCase();
		System.out.println(str);
		
		String rf=reformat(str);

	}

	static String reformat(String str) 
	{
		StringBuilder sb= new StringBuilder(str);
		
		char[] s=str.toCharArray();
		
		System.out.println(Arrays.toString(s));
		
		int cLetter=0;
		int cNumber=0;
		
		for (int i = 0; i < s.length; i++) 
		{
			if(Character.isAlphabetic(sb.charAt(i)))
			{
				cLetter++;
			}
			else //if (Character.isDigit(sb.charAt(i))) 
			{
				cNumber++;
			}
		}
		System.out.println(cLetter + " "+ cNumber);
		
		int ifPossible= cLetter-cNumber;
		StringBuilder newStr=new StringBuilder(str);
		if(ifPossible==1 || ifPossible==0 || ifPossible==-1)
		{
			if(cLetter>=cNumber)
			{
				int j=0;
				for (int i = 0; i < s.length; i++) 
				{
					if (Character.isAlphabetic(sb.charAt(i))) 
					{
						int letterIndex=2*i;
						newStr.append(newStr.charAt(letterIndex));			
					}
					else if (Character.isDigit(sb.charAt(i))) 
					{
						int numberIndex=2*i+1;
						newStr.append(newStr.charAt(numberIndex));
					}
				}
			}
		}
		
		
		return null;
	}

}
