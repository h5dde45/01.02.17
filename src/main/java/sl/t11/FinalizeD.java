package sl.t11;

public class FinalizeD {
    public static void main(String[] args) {
        User user1=new User(1);
        User user2=new User(2);
        user1=null;
        Object user3=user2;
//        Object user3=new Object();
        user2=user1;
        System.gc();

    }
}
class User{
    private int id;

    public User(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println(id);
        } finally {
            super.finalize();
        }
    }
}
