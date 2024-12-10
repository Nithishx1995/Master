package com.arrays;

public class StarPatterns {

	public static void main(String[] args) {
		int n=4;
//		pattern(n);
//		pattern2(n);
//		pattern3(n);
		pattern5(n);

	}
	static void pattern(int n)
	{
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
				
			}	
			System.out.println();
		}
	}
	static void pattern2(int n)
	{
		for (int i = 0; i < n; i++) {
			for (int j = n-i; j >0; j--) {
				System.out.print("* ");
				
			}	
			System.out.println();
		}
	}
	static void pattern3(int n)
	{
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(j+1+" ");
				
			}	
			System.out.println();
		}
	}
	static void pattern4(int n)
	{
		for (int i = 0; i <2*n; i++) {
			int tRow= i<n ? i: 2*n-i;
			for (int j = 0; j <tRow; j++) {
				System.out.print("* ");
				
			}	
			System.out.println();
		}
	}
	static void pattern5(int n)
	{
		int k=n+1;
		n=2*n;
		
		for (int i = 1; i <n; i++) {
			for (int j = 1; j <n; j++) {
				int numberPrint=k-(Math.min(Math.min(i, j), Math.min(n-i,n-j)));
				System.out.print(numberPrint+ " ");
			}
			System.out.println();
			
			
		}
		
		
	}

}
