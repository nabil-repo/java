class compileT {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String concatenate(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Sum of two ints: " + add(5, 10));

        System.out.println("Sum of three ints: " + add(5, 10, 15));

        System.out.println("Sum of two doubles: " + add(2.5, 3.5));

        System.out.println("Concatenated Strings: " + concatenate("Hello, ", "world!"));
    }
}
