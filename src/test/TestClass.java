package test;

import java.util.Scanner;


public class TestClass {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in)	;
	car();
	
	System.out.println("start?:");
	char loop=sc.next().charAt(0);
	while(loop=='y') {
		System.out.println("enter a valid chararcter:");
		char ch=sc.next().charAt(0);
	if (ch=='a' | ch=='b' | ch=='c' | ch=='x') {
	switch(ch) {
	
		case 'a':
			
			System.out.println("hello there");
			break;
		case 'b':
			for (int n=0;n<5;n++)
			{
				System.out.println(n);
			}
			break;
		case 'c':
			for(int e=1;e<10;e++)
			{
				if(e%2==0)
					System.out.println("even nos:"+e);
				else
					System.out.println("odd nos:"+e);
			}
				
			break;
		default:
			System.out.println("No functions available, enter valid character");
	}
	}
	System.out.println("continue:?");
	loop=sc.next().charAt(0);
	}
	
		
		
		
	}
	static void car() {
		for(int i=0;i<5;i++)
			System.out.println(i + " ");
		
	}

}
