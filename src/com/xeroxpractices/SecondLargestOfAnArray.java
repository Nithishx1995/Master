package com.xeroxpractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestOfAnArray {

	public static void main(String[] args) 
	{
				
		List<Integer> val= new ArrayList();
		val.add(2);
		val.add(1);
		val.add(4);
		val.add(8);
		val.add(9);
		
		Collections.sort(val);
		try {
			System.out.println(val.get(val.size()-2));
		}
		catch (IndexOutOfBoundsException e) {
			System.err.println(e);
			System.err.println("enter 'val.size()-2' to get correct op");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
