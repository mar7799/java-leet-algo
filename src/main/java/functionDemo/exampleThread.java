package functionDemo;

public class exampleThread {
    public static void main(String[] args) {
        exampleThread t = new exampleThread();
        Thread t1 = new Thread();
        t1.start();

    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
