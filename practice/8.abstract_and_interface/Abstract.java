// Abstract class
abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract double calculateArea();

    // Concrete method
    void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}

// Concrete subclass Circle
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method for calculating the area of a circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method for calculating the area of a rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Abstract{
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling the displayArea method for both objects
        System.out.println("Circle:");
        circle.displayArea();

        System.out.println("\nRectangle:");
        rectangle.displayArea();
    }
}
