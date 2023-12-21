
class base {
    public base() {
        System.out.println("Base");
    }
}

class Derived extends base {
    public Derived() {
        System.out.println("Derived");
    }
}

class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        base b = new base();

    }
};