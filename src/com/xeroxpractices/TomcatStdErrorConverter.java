package com.xeroxpractices;

import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class TomcatStdErrorConverter {


    final static String defDebugLvl = "DEBUG";
    final static Level severe = Level.SEVERE;
    static String debugLvl = "INFO";
    static Level info = Level.INFO;

    static String dsHome = "C:\\\\Users\\\\nithish.k\\\\Downloads\\\\XEROX";
    static String targetDir = "";
    static String logDir = "";
    static String fileOperation = "";
    static String dsRoot = "";

    static Logger logger = Logger.getLogger(TomcatStdErrorConverter.class.getName());

    public static void main(String[] args) throws IOException {
        int argNum = 0;
       
        logDir = dsHome + File.separator + "logs" + File.separator + "tomcat.txt";
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(logDir)))) {
        	String line;
            StringBuffer buffer = new StringBuffer();
            String filecontents=null;
            while (( line= reader.readLine()) != null) {
            	System.out.println("lines are :---"+line);
            	 int x = line.indexOf("INFO");
            	 String before= line.substring(0,x+5);
            	 String next= line.substring(x+5);
            	 System.out.println("before-->"+ before + "\n next-->"+next);
            	 
               
                buffer.append(next +System.lineSeparator());
                filecontents = buffer.toString();
     		               
     			
            	
//            	 System.out.println("index is:---"+x);
//            	 System.out.println("before is:---"+before);
//            	 System.out.println("Subs is:---"+utf8String);
//            	 buffer.append(line);
//            	 //buffer.append(utf8String +System.lineSeparator());
//            	 filecontents =  buffer.toString();
//            	reader2= new BufferedReader(new InputStreamReader(
//                        new FileInputStream(logDir), StandardCharsets.UTF_8));
//            	modifiedLine=line.substring(10);
//            	firsthalf = line.substring(0,9);
//            	System.out.println(firsthalf+ ":" +modifiedLine); 
//            	while((modifiedLine=reader2.readLine()) != null)
//				{
//		                System.out.println(firsthalf+modifiedLine); 
//		                buffer.append(modifiedLine +System.lineSeparator());
//		                filecontents = buffer.toString();
//				}
//            }
            	 
//                 	buffer.append(next);
//                 	filecontents =  buffer.toString();
//                 	System.out.println("next new line"+next);
//                
            }
        
            
            FileWriter writer = new FileWriter(logDir);
            writer.append(filecontents);
			
            writer.flush();
            try (BufferedReader reader2 = new BufferedReader(new InputStreamReader(
                    new FileInputStream(logDir), StandardCharsets.UTF_8))) {
            	String line2;
                StringBuffer buffer2 = new StringBuffer();
                String filecontents2=null;
                while (( line2= reader2.readLine()) != null) {
                	
                 buffer.append(line2 +System.lineSeparator());
                    filecontents2 = buffer2.toString();
            	
            }
            FileWriter writer2 = new FileWriter(logDir);
            writer2.append(filecontents2);
            writer2.flush();
            
//            FileWriter writer = new FileWriter(logDir,StandardCharsets.UTF_8);
//            writer.append(filecontents);
//            writer.flush();
//	    	 FileHandler handler = new FileHandler(logDir, true);
//	         handler.setEncoding("UTF-8");
//            
//            SimpleFormatter formatter = new SimpleFormatter();
//            handler.setFormatter(formatter);
//
//            logger.addHandler(handler);
            System.out.println("File converted!!");
        }
        
        catch (Exception e) {
            System.out.println("Patch.logMessage: Can't access log file because of this exception: "
                    + e.getMessage());
        }
    }
}
}


