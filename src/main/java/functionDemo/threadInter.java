package functionDemo;

public class threadInter implements Runnable{
    public void run(){
        System.out.println("thread in interface" +
        Thread.currentThread().getPriority());
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("printing i in thread" + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new threadInter());
//        System.out.println("thread priority is " + t.getPriority());
        t.start();
        t.setPriority(10);
        for(int i = 10 ; i >= 0 ; i--){
            System.out.println("printing i in main" + i);
            }

        }
    }

