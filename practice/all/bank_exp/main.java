package bank_exp;

import java.util.Scanner;

class myException extends Exception {

    public myException(String str) {
        super(str);
    }
}

class bank {
    int bal = 1000;

    void withdwraw(int amount) throws myException {
        if (amount > bal) {
            throw new myException("Insufficient Balance");
        }
    }
}

public class main {
    public static void main(String[] args) throws myException {
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        bank b = new bank();
        b.withdwraw(amount);
        sc.close();
    }

}