package com.arrays;

import java.util.Scanner;
import java.util.*;

public class KushalsArraytest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the series of nos:");
		for (int i=0;i<arr.length;i++) 
			
			arr[i]=in.nextInt();
			
		
		System.out.println(Arrays.toString(arr));
		
		update(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	static void update(int[] arr) {
		arr[3]=40;
		
	}

}
