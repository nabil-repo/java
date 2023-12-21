
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class userexp {

    public static void main(String args[]) {
        try {

            throw new MyException("my exp");
        } catch (MyException ex) {
            System.out.println("Caught");

            System.out.println(ex.getMessage());
        }
    }
}