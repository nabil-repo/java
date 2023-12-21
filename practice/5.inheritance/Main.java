// Base class (Superclass)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Single Inheritance: Dog is a subclass of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multiple Inheritance (through interfaces): Flying interface
interface Flying {
    void fly();
}

// Multiple Inheritance (through interfaces): Bird is a subclass of Animal and
// implements Flying interface
class Bird extends Animal implements Flying {
    void chirp() {
        System.out.println("Bird is chirping");
    }

    // Implementation of the fly method from the Flying interface
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Hierarchical Inheritance: Cat and Tiger are subclasses of Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Tiger extends Animal {
    void roar() {
        System.out.println("Tiger is roaring");
    }
}

public class Main {
    public static void main(String[] args) {
        // Single Inheritance example
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println();

        // Multiple Inheritance (through interfaces) example
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.chirp();
        bird.fly();

        System.out.println();

        // Hierarchical Inheritance example
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.meow();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        tiger.roar();
    }
}
