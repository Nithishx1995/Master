package com.xeroxpractices;

public class StringImmutableDemo {

	public static void main(String[] args) {
		String str1="Nithish";
		String str2="Java";
		str1.concat(str2);
		System.out.println("If mutable: "+str1);
		
		
		String str3=str1+str2;
		str1=str1.concat(str2);

		System.out.println("reason If Mutable: "+(str1==str3));
		System.out.println("checking if objects are equal: "+str1.equals(str3));

	}

}
