package src.xeroxpractices.collectionsdemo;

class StudentSing {

    private static StudentSing sn;

    private void StudentSing(){}

    public static synchronized StudentSing demo()
        {
            if(sn==null)
            {
                sn=new StudentSing();
            }
            return sn;
        }
    }


