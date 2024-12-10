package com.xeroxpractices.march_10;

class ABC
{
	public void strngPrint(String h)
	{
		System.out.println("hello");
	}
}

class AB extends ABC
{
	
	public void calDemo()
	{
		System.out.println("Default overloading");
	}
	
	public void calDemo(int i,int  j, String S)
	{
			
		int k=i+j;
		
		System.out.println(S+" Parameterised overloading method with output: "+k);
	}
	
	public void strngPrint(String h)
	{
		
		System.out.println("ABC class is now defined and Overrided by AB class which is :"+h);
	}

	
	
}

public class OverloadingOverrinding extends AB{

	public static void main(String[] args) {
		
		int i=2;
		int j =4;
		String s="Hi";
		String name="NITHISH";

		AB aObj= new AB();
				
		
		//aObj.calDemo();
		aObj.calDemo(i,j,s);
		aObj.strngPrint(name);

	}

}
