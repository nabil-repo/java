package employee;
import java.util.Scanner;

public class employee {
    String name, date;
    int salary;

    employee() {
        this.name = null;
        this.salary = 0;
        this.date = null;
    }

    void getdata() {
        System.out.println("Employee Data:");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        this.name = s.nextLine();
        System.out.println("Enter date of joining:");
        this.date = s.nextLine();
        System.out.println("Enter Salary:");
        this.salary = s.nextInt();
    }

    void display() {
        System.out.println("\n\nEmployee Data:");
        System.out.println("Name: " + this.name);
        System.out.println("Date of joining: " + this.date);
        System.out.println("Salary: " + this.salary);
    }

    public static void main(String[] args) {
        employee[] e = new employee[3];

        for (int i = 0; i < 1; i++) {
            e[i] = new employee();
            e[i].getdata();
        }

        employee e2 = e[0];

        // for (int i = 0; i < 3; i++) {
        //     e[i].display();
        // }

        e2.display();
    }
}
