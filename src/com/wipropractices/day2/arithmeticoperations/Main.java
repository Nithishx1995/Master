package src.com.wipropractices.day2.arithmeticoperations;

public class Main{


    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;

        Calculator subtract = (a, b) -> a - b;

        // Multiply
        Calculator multiply = (a, b) -> a * b;

        // Divide
        Calculator divide = (a, b) -> b != 0 ? a /b:0;

        System.out.println("Add:"+add.calculate(1,2));
        System.out.println("subtract:"+subtract.calculate(1,2));
        System.out.println("multiply:"+multiply.calculate(1,2));
        System.out.println("divide:"+divide.calculate(1,2));



    }
}
