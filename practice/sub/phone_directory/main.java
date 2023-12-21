package directory;

import java.util.Scanner;

class Directory {
    private int uid;
    private String name;
    private String address;
    private String telephone;
    private String mobile;
    private String headOfFamily;

    public Directory(int uid, String name, String address, String telephone, String mobile, String headOfFamily) {
        this.uid = uid;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
    }

    public int getUniqueId() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public void updateEntry(String name, String address, String telephone, String mobile, String headOfFamily) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxEntries = 100;
        Directory[] dir = new Directory[maxEntries];

        int cruntEntry = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a) Create a database entry");
            System.out.println("b) Edit an entry");
            System.out.println("c) Search by keyword");
            System.out.println("q) Quit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    if (cruntEntry < maxEntries) {
                        createEntry(scanner, dir, cruntEntry++);
                    } else {
                        System.out.println("Maximum number of entries reached.");
                    }
                    break;
                case "b":
                    editEntry(scanner, dir, cruntEntry);
                    break;
                case "c":
                    searchEntry(scanner, dir, cruntEntry);
                    break;
                case "q":
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void createEntry(Scanner scanner, Directory[] dir, int uid) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Telephone Number (with STD code, if available): ");
        String telephone = scanner.nextLine();
        System.out.print("Enter Mobile Number: ");
        String mobile = scanner.nextLine();
        System.out.print("Enter Head of the Family: ");
        String headOfFamily = scanner.nextLine();

        Directory entry = new Directory(uid, name, address, telephone, mobile, headOfFamily);
        dir[uid] = entry;

        System.out.println("Entry created successfully.");
    }

    private static void editEntry(Scanner scanner, Directory[] dir, int cruntEntry) {
        System.out.print("Enter Unique ID to edit: ");
        int uid = scanner.nextInt();
        scanner.nextLine();

        int index = searchById(dir, cruntEntry, uid);

        if (index != -1) {
            Directory entry = dir[index];

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter Telephone Number (with STD code, if available): ");
            String telephone = scanner.nextLine();
            System.out.print("Enter Mobile Number: ");
            String mobile = scanner.nextLine();
            System.out.print("Enter Head of the Family: ");
            String headOfFamily = scanner.nextLine();

            entry.updateEntry(name, address, telephone, mobile, headOfFamily);

            System.out.println("Entry edited successfully.");
        } else {
            System.out.println("Entry not found.");
        }
    }

    private static void searchEntry(Scanner scanner, Directory[] dir, int cruntEntry) {
        System.out.print("Enter a keyword to search: ");
        String keyword = scanner.nextLine().toLowerCase();

        for (int i = 0; i < cruntEntry; i++) {
            Directory entry = dir[i];
            if (entry.getName().toLowerCase().contains(keyword) ||
                    entry.getAddress().toLowerCase().contains(keyword) ||
                    entry.getTelephone().toLowerCase().contains(keyword) ||
                    entry.getMobile().toLowerCase().contains(keyword) ||
                    entry.getHeadOfFamily().toLowerCase().contains(keyword)) {
                System.out.println("Unique ID: " + entry.getUniqueId());
                System.out.println("Name: " + entry.getName());
                System.out.println("Address: " + entry.getAddress());
                System.out.println("Telephone: " + entry.getTelephone());
                System.out.println("Mobile: " + entry.getMobile());
                System.out.println("Head of Family: " + entry.getHeadOfFamily());
                System.out.println();
            }
        }
    }

    private static int searchById(Directory[] dir, int cruntEntry, int uid) {
        for (int i = 0; i < cruntEntry; i++) {
            if (dir[i].getUniqueId() == uid) {
                return i;
            }
        }
        return -1;
    }
}
