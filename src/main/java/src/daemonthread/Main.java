package daemonthread;

import java.util.concurrent.ExecutionException;


//  2020/09/02 lesson
public class Main {

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread completed");
        }
    }


    public static void main(String[] args)  {

        System.out.println("Start");
        Thread t = new MyThread();
        t.setDaemon(true);
        t.start();
        System.out.println("Done");
    }


}
