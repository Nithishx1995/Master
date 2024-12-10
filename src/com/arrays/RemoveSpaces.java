package com.arrays;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str= " Hi Nithish";
		str=str.replaceAll("[a-z]", "");
		System.out.println("final output after removing spaces is ->"+str);

	}

}
