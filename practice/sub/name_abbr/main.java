package name_abbr;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = s.nextLine();
        String[] arr = name.split(" ", 3);

        System.out.print(arr[0].charAt(0) + ".");
        System.out.print(arr[1].charAt(0) + ".");

        System.out.println(arr[arr.length - 1]);
    }

}
