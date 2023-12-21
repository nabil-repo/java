public class Main {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);

        StringBuffer sb = new StringBuffer();
        sb.append(s);
        sb.append(" World");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
    }
}