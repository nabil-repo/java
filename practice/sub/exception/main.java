import java.util.*;

public class main {
    public static void main(String[] args) throws MyException {
        int n = 5;
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        while (n > 0) {
            n--;
            Scanner sc = new Scanner(System.in);
            arr[n] = sc.nextInt();
        }

        // Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    
                    throw new MyException("Duplicate element present in array");
                }

            }
        }
    }

    static class MyException extends Exception {

        public MyException(String str) {
            super(str);
        }
    }
}