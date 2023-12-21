package restro;

import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private MenuItem[] items;
    private int itemCount;

    public Order(int maxItems) {
        items = new MenuItem[maxItems];
        itemCount = 0;
    }

    public void addItem(MenuItem item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Order is full. Cannot add more items.");
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
}

class Restaurant {
    static MenuItem[] menu = {
            new MenuItem("Burger", 150.0),
            new MenuItem("Pizza", 250.0),
            new MenuItem("Pasta", 180.0),
            new MenuItem("Soda", 50.0)
    };

    public static void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i].getName() + " - Rs. " + menu[i].getPrice());
        }
    }

    public static double getDiscount(double total, boolean isBirthday) {
        double discount = 0;
        if (total >= 500 && total <= 1000) {
            discount = 0.10;
        } else if (total > 1500) {
            discount = 0.15;
        }
        if (isBirthday) {
            discount += 0.05;
        }
        return discount * total;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Order order = new Order(10);

        System.out.println("Welcome to our restaurant!");
        boolean isBirthday = false;

        do {
            Restaurant.displayMenu();
            System.out.print("Enter the item number to order (0 to exit): ");
            choice = sc.nextInt();

            if (choice > 0 && choice <= Restaurant.menu.length) {
                order.addItem(Restaurant.menu[choice - 1]);
            }
        } while (choice != 0);

        System.out.println("Birthday (yes=1,no=0): ");
        int ch = sc.nextInt();

        isBirthday = ch == 1 ? true : false;

        double total = order.getTotal();
        double discount = Restaurant.getDiscount(total, isBirthday);
        double finalBill = total - discount;

        System.out.println("Order Total: Rs. " + total);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Bill: Rs. " + finalBill);

        System.out.println("Thank you!");
    }
}
