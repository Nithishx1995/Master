package com.xeroxpractices;

class A
{
	public String str;
	
	
}

public class NullPointerExcepDemo 	extends A{

	public static void main(String[] args) {

		A a= new A();
		System.out.println(a.str.charAt(5));

	}

}
