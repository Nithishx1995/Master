package com.xeroxpractices;

public class CompareTwoArrayOfInteger {

	public static void main(String[] args) {

		int[] arr1= {1,3,4,5,2};
		int[] arr2= {1,2,3,4,5};
		
		compareArrays(arr1,arr2);
		

	}
	static void compareArrays(int[] arr1, int[] arr2)
	{
		int tCount=arr1.length+ arr2.length;
		int cCount=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				
				if(arr1[i]==arr2[j])
				{
					cCount++;
					break;
				}
				
			
			}
			
		}
		if(cCount==tCount/2) {
			System.out.println("contains same elements");
		}
		else
		{
			System.out.println("Not matching elements");
		}
	}

}
