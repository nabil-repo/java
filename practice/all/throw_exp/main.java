package throw_exp;

class myException extends Exception {

    public myException(String str) {
        super(str);
    }
}

public class main {
    public static void main(String[] args) throws myException {
        int x = 5, y = 1000;
        try {
            double s = (double) x / y;

            if (s < 0.01) {
                throw new myException("Number is tooo small");
            }
        } catch (Exception e) {
            System.out.println("Cought my Exception");
            System.out.println(e);
        }finally{
            System.out.println("This is the example of throw");
        }
    }

}
