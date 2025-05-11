package src.com.wipropractices.day1.greeting.impl;

import src.com.wipropractices.day1.greeting.service.Greeting;

public class EnglishGreeting  implements Greeting {

    @Override
    public void defaultGreet()
    {
        System.out.println("defaultGreet() overridden");
    }

    public static void main(String[] args) {

        EnglishGreeting eg= new EnglishGreeting();
        eg.defaultGreet();
        Greeting.staticGreet();


    }

}