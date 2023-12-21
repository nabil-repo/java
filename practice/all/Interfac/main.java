package Interfac;

interface addmission {
    void registration();
    void batch();

}

public class main implements addmission {
    public static void main(String[] args) {
        main m = new main();
        m.registration();
        m.batch();

    }

    public void registration() {
        System.out.println("Addmission done");
    }

    public void batch() {
        System.out.println("Batch done");
    }
}
