package class_and_obj.malti_level_inheritance;

class A {

    void a() {
        System.out.println("Inside A class");
    }
}

class B extends A {

    void b() {
        System.out.println("Inside B class");
    }
}

class C extends B {

    void c() {
        System.out.println("Inside C class");
    }
}

public class main {
    public static void main(String[] args) {
        C obj = new C();
        obj.a();
        obj.b();
        obj.c();

    }

}
