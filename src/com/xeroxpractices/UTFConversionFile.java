package com.xeroxpractices;


import java.io.*;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class UTFConversionFile {
	static String dsHome = "C:\\\\Users\\\\nithish.k\\\\Downloads\\\\XEROX";
	static String filePath = "";
	
	public static void main(String[] args) {
        // Replace with your file path
        String filePath = dsHome + File.separator + "logs" + File.separator + "tomcat.txt";

        // Specify suspected encoding (replace with actual suspected encoding)
        String suspectedEncoding = "ISO-8859-1"; // Example: Latin-1 encoding

        try {
            // Step 1: Read file content with suspected encoding
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                // Step 2: Convert garbled characters in each line
                String convertedLine = convertGarbledCharacters(line);
                content.append(convertedLine).append("\n");
            }
            br.close();

            // Step 3: Write back to file with UTF-8 encoding
            String utf8Content = content.toString();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8"));
            bw.write(utf8Content);
            bw.close();

            System.out.println("File converted to UTF-8 successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to convert garbled characters to UTF-8
    private static String convertGarbledCharacters(String line) {
        StringBuilder convertedLine = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            // Check if the character is outside of basic UTF-8 range
            if (!(c >= '\u0000' && c <= '\u007F') && !(c >= '\u00A0' && c <= '\u00FF')) {
                // Convert garbled character to UTF-8
                byte[] utf8Bytes = Character.toString(c).getBytes(StandardCharsets.UTF_8);
                String utf8String = new String(utf8Bytes, StandardCharsets.UTF_8);
                convertedLine.append(utf8String);
            } else {
                convertedLine.append(c);
            }
        }

        return convertedLine.toString();
    }
}