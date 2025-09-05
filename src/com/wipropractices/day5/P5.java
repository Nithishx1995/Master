package src.com.wipropractices.day5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class P5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 3, 23);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}

