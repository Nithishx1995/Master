package com.arrays;

import java.util.Iterator;

public class NumberSeparation {
    public static void main(String args[] ) throws Exception {
        int[] arr= {71,18,42,21,67,32,95,14,56,87};
        NumbrSeparation(arr);
    }
    static void NumbrSeparation(int[] arr)
    {	
    	int o=0;
    	int e=0;
    	
    	for (int i = 0; i < arr.length; i++) 
    	{
			if (arr[i]%2==0) 
			{
				e++;	
			}
			else 
				o++;
		}
    	int[] even=new int[e];
    	int[] odd=new int[o];
    	int j=0;
    	int k=0;
    	for (int i = 0; i < arr.length; i++) 
    	{
    		if(arr[i]%2==0)
    		{
    				
    				if(j<e)
    				{
    					even[j]=arr[i];
                		j++;
    				}
    		}
    		else
    		{
    			
				if(k<o)
				{
    				odd[k]=arr[i];
        			
        			k++;
				}
    		}
    		
				
    			
		}
    	System.out.println("Even Nos are..:");
    	for (int i = 0; i < even.length; i++) {
    		
    		
    		System.out.println(even[i]);
    		
			
		}
    	System.out.println("Odd Nos are..:");
    	for (int l = 0; l < odd.length; l++) {
    		System.out.println(odd[l]);
    		
			
		}
    	
		}
}