package com.xeroxpractices.march_10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TwoArrayComparison {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {2,3,6,7,8};
		
		//passing and checking the comparison metjod
		compareArrays(arr1,arr2);
		

	}
	static void compareArrays(int[] arr1, int[] arr2)
	{
		
		int tCount= arr1.length+arr2.length;
		int cCount=0;
		int k=0;
		int[] arr3= new int[arr1.length];
		
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				
				if(arr1[i]==arr2[j])
				{
					//cCount++;
//					if(k<=arr3.length)
//					{
//						arr3[k]=arr2[j];
//						
//						k++;
//						break;	
//					}
						arr3[k]=arr2[j];
						lh.add(arr3[k]);
										
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(arr3));
		System.out.println("Output for the common elements are: "+lh);
////		if(tCount/2==cCount)
////		{
////			System.out.println("Arrays are Matching");
////		}
//		else 
//			System.out.println("Not matching elements");
		
	}

}
