package com.xeroxpractices.march_10;

interface XYZ
{
	static void staticShow()
	{
		System.out.println("Inside Interface Static show()");
	}
	
	public void defaultShow(String str);
}

public class InterfaceStaticDefault implements XYZ{

	public static void main(String[] args) {
		
		InterfaceStaticDefault obj = new InterfaceStaticDefault();
		obj.defaultShow("Hi calling default method");
		
		XYZ.staticShow();
	}
	
	public void defaultShow(String str)
	{
		System.out.println(str);
	}

}
