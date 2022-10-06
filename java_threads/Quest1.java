// 1).Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in the created threads.
class createThread extends Thread {
    public void run() {
        System.out.println("Thread class is starting : " + getName());
        try {
            System.out.println(getName() + "is going to sleep");
            Thread.sleep(1000);
            System.out.println(getName() + "wakes up");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ThreadByRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable Thread is running");
    }
}

public class Quest1 {
    public static void main(String[] args) throws InterruptedException {
        createThread T1 = new createThread();

        ThreadByRunnable rt = new ThreadByRunnable();
        Thread T2 = new Thread(rt);
        createThread T3 = new createThread();

        T1.start();
        T1.join();
        System.out.println("\n\n");
        T3.start();
        T3.join();
        System.out.println("\n\n");
        T2.start();
    }
}
