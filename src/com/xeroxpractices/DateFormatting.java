package com.xeroxpractices;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		String formatDisplay="MM-dd-yyyy hh:mm:sss";
		SimpleDateFormat dt=new SimpleDateFormat(formatDisplay);
		String date = dt.format(new Date());
		System.out.println(date);
		
		
	}

}
