//copy constructor(object)
package employee;
import java.util.Scanner;

public class employee2 {
    String name, date;
    int salary;

    employee2() {
        this.name = null;
        this.salary = 0;

    }

    employee2(String na, int sal) {
        this.name = na;
        this.salary = sal;

    }

    employee2(employee2 e) {
        this.name = e.name;
        this.salary = e.salary;
    }

    // void getdata() {
    // System.out.println("Employee Data:");
    // Scanner s = new Scanner(System.in);
    // System.out.println("Enter Name:");
    // this.name = s.nextLine();
    // System.out.println("Enter date of joining:");
    // this.date = s.nextLine();
    // System.out.println("Enter Salary:");
    // this.salary = s.nextInt();
    // }

    void display() {
        System.out.println("\n\nEmployee Data:");
        System.out.println("Name: " + this.name);
        // System.out.println("Date of joining: " + this.date);
        System.out.println("Salary: " + this.salary);
    }

    public static void main(String[] args) {
        employee2 e = new employee2("Abc", 123);

        employee2 e2 = new employee2(e);
        e.display();
        e2.display();
    }
}
