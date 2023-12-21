package class_and_obj.single_inherit;

class Animal {
    String name = "dog";

    void eat() {
        System.out.println(name + " is Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

public class main {
    public static void main() {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
