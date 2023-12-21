package abstrct_shape;

abstract class Shape {
    abstract void area(int r);

    abstract void perimeter(int i);
}

class circle extends Shape {
    void area(int r) {
        System.out.println("Area of Circle:" + 3.14 * r * r);
    }

    void perimeter(int i) {
        System.out.println("Perimeter of Circle:" + 2 * 3.14 * i);
    }
}

class triangle extends Shape {
    void area(int r) {
        System.out.println("Area of Triangle:" + 0.5 * r * r);
    }

    void perimeter(int i) {
        System.out.println("Perimeter of Triangle:" + 3 * i);
    }
}

public class main {
    public static void main(String[] args) {
        circle c = new circle();
        c.area(5);
        c.perimeter(4);

        triangle t = new triangle();
        t.area(5);
        t.perimeter(4);
    }
}
