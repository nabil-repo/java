package area_perimeter;

// Abstract class Shape
abstract class Shape {
    // Abstract methods to calculate area and perimeter
    public abstract double area();

    public abstract double Peri();
}

// Subclass Circle extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double Peri() {
        return 2 * 3.14 * radius;
    }
}

// Subclass Triangle extending Shape
class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        // Heron's formula to calculate area of triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double Peri() {
        return side1 + side2 + side3;
    }
}

public class main {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.Peri());

        // Creating a Triangle object
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.Peri());
    }
}