package src.com.wipropractices.day5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class P4 {
    public static void main(String[] args) {
        String dateString = "2025-03-23";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed Date: " + parsedDate);
    }
}

