package employee;

import java.util.Scanner;

class Employee {
    private double salary;
    private int workHours;
    private String name;

    public Employee() {
        this.salary = 0;
        this.workHours = 0;
    }

    public void getInfo(String name, double salary, int workHours) {
        this.salary = salary;
        this.name = name;
        this.workHours = workHours;
    }

    public void AddSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void AddWork() {
        if (workHours > 6) {
            salary += 5;
        }
    }

    public void display() {
        AddSal();
        AddWork();
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Worked Hours: " + workHours);
        System.out.println("Final Salary: $" + salary);

    }
}

public class main {
    public static void main(String[] args) {

        Employee emp = new Employee();
        System.out.println("Employee Information:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name = sc.nextLine();
        System.out.print("Enter the salary: ");
        double sal = sc.nextDouble();
        System.out.print("Enter the number of hours worked per day: ");
        int hrs = sc.nextInt();

        sc.close();
        emp.getInfo(name, sal, hrs);
        emp.display();
    }
}
