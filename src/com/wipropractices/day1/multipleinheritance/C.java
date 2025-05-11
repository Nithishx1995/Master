package src.com.wipropractices.day1.multipleinheritance;

public class C implements A,B{


    @Override
    public void show() {
        A.super.show();
        B.super.show();
    }
}

