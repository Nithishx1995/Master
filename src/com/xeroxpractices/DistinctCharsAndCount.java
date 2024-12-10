package com.xeroxpractices;

public class DistinctCharsAndCount {

	public static void main(String[] args) 
	{
		String word="Nithish";
		word=word.toLowerCase();
		
		charCount(word);
		

	}

	static void charCount(String word) 
	{
		StringBuilder sb=new StringBuilder(word);
		StringBuilder newArr=new StringBuilder();
		newArr.setLength(sb.length());
		
		String disWord= distinctChar(word);
		
		for (int i = 0; i < sb.length(); i++) 
		{
			int count=1;
			for (int j = 0; j < sb.length(); j++) 
			{
				
				if(word.charAt(i)==word.charAt(j) && i != j)
				{
					count++;
					
				}
				
			}
			for (int j = i; j < sb.length(); j++) 
			{
				System.out.println(newArr.append(sb.charAt(i)+""+count));
				break;
			}
			
		}
		
	}

	static String distinctChar(String word) 
	{
		StringBuilder sb1=new StringBuilder(" ");
		
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < sb1.length(); j++) 
			{
				if(word.charAt(i)==sb1.charAt(j))
				{
				break;
				
				
				}
				else
					sb1=sb1.append(word.charAt(i));
			}
			
			
		}
		
		
		return null;
	}

}
