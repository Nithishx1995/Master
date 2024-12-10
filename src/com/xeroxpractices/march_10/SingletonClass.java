package com.xeroxpractices.march_10;

class A
{
	static A aObj =new A();
	
	private A() {};
	
	static A show()
	{
		System.out.println("to just return only one Object: "+aObj);
		return aObj;
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		
		A a=A.show();

	}

}
