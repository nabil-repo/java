package exception;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        try {
            // int i = 10 / 0;
            sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Inside finally block");
        }

    }
}
