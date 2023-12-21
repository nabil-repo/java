
public class Main {
    public interface FuncInterface {

        public void func(int x);
    }

    public static void main(String[] args) {
        FuncInterface fobj = (int x) -> System.out.println(2 * x);

        fobj.func(5);
    }
}