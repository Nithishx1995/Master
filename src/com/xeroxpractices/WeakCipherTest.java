package com.xeroxpractices;

import java.io.*;

public class WeakCipherTest {

	public static void main(String[] args) {
		String filePath= "C:\\Users\\nithish.k\\Downloads\\PEARSON\\KT\\BasicTest.txt";
		removeLinuxCiphers(filePath);
 	}
	public static void  removeLinuxCiphers(String filePath) {
		try {
			
			BufferedReader in = new BufferedReader(new FileReader(filePath));
			
			
			
			StringBuffer sb = new StringBuffer();
			String line;
			String content = "";
			while((line = in.readLine())!= null) {
				
				if(line.contains("DEjIdReSpAqL2asW")) {
					if(!line.equals("SSLCipherSuite HIGH:MEDIUM:!MD5:!RC4")) {
						content += line;
						String wline=line.replace(content,"SSLCipherSuite HIGH:MEDIUM:!MD5:!RC4");
						if(wline.contains("SSLCipherSuite HIGH:MEDIUM:!MD5:!RC4"))
						{
							BufferedWriter wr = new BufferedWriter(new FileWriter(filePath));
							wr.write(wline.replace(wline,"SSLCipherSuite HIGH:MEDIUM:!MD5:!RC4"));
							wr.close();
						}
						break;
					}
				}
				
			}
			in.close();
//			BufferedWriter wr = new BufferedWriter(new FileWriter(filePath));
//			wr.write(line);
			
			System.out.println("Success!");
		} catch (IOException e) {
			e.getMessage();
		}	

}
}
