class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class main {
    public static void main(String[] args) {
        // Creating two threads
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
