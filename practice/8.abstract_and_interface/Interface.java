//there can be only abstract methods in the Java interface, not the method body.

interface Shape {
    double calculateArea();

    void displayInfo();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayInfo() {
        System.out.println("Circle - Radius: " + radius);
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayInfo() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
    }
}

public class Interface {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle:");
        circle.displayInfo();
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("\nRectangle:");
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
