package com.xeroxpractices;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WeakCipherTestLineSep {

	public static void main(String args[]) throws IOException {
	      //Instantiating the File class
	      String filePath = "C:\\\\Users\\\\nithish.k\\\\Downloads\\\\PEARSON\\\\KT\\\\BasicTest.txt";
	      //Instantiating the Scanner class to read the file
	      Scanner sc = new Scanner(new File(filePath));
	      //instantiating the StringBuffer class
	      StringBuffer buffer = new StringBuffer();
	      //Reading lines of the file and appending them to StringBuffer
	      while (sc.hasNextLine()) {
	         buffer.append(sc.nextLine()+System.lineSeparator());
	      }
	      String fileContents = buffer.toString();
	      //System.out.println("Contents of the file: "+fileContents);
	      //closing the Scanner object
	      sc.close();
	      if (fileContents.contains("<VirtualHost _default_:443>"))
	      {
		    	  String newLine = "#Add Strong sslCiphersuite: \n"+"\tSSLCipherSuite HIGH:MEDIUM:!MD5:!RC4 \n"+"\t#Add Strong Protocol: \n"+"\tSSLProtocol  all -SSLv3 -TLSv1 -TLSv1.1 \n";
		    	  if (fileContents.contains("<VirtualHost _default_:443>"))
		    	  {
		    		  if (!fileContents.contains("SSLCipherSuite HIGH:MEDIUM:!MD5:!RC4"))
		    		  {
		    			  fileContents = fileContents.replaceAll("<VirtualHost _default_:443>", ("<VirtualHost _default_:443>"+"\n\t"+newLine));  
		    		  }
		    		  else
		    			  System.out.println("SSLCipherSuites already present");
		    		  
		    		  
		    	  }
	      }
	       
	      
	      //Replacing the old line with new line
//	      fileContents = fileContents.replaceAll(oldLine, newLine);
	      //instantiating the FileWriter class
	      FileWriter writer = new FileWriter(filePath);
	      writer.append(fileContents);
	      writer.flush();
	   }
}
