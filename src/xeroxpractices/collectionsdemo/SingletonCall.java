package src.xeroxpractices.collectionsdemo;

public class SingletonCall{


    public static void main(String[] args) {
        StudentSing sn=new StudentSing();
        StudentSing sn1=sn;

        System.out.println(sn);
        System.out.println(sn1);
    }

}
