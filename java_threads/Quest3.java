// 3). Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.
class Table {
    synchronized void tablePrint(int n) {
        int i = 1;
        while (i <= 10) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i += 1;
        }
    }
}

class Thread1 extends Thread {
    Table T;

    Thread1(Table T) {
        this.T = T;
    }

    public void run() {
        T.tablePrint(4);
    }
}

class Thread2 extends Thread {
    Table T;

    Thread2(Table T) {
        this.T = T;
    }

    public void run() {
        T.tablePrint(16);
    }
}

public class Quest3 {
    public static void main(String[] args) {
        Table obj = new Table();
        Thread1 T1 = new Thread1(obj);
        Thread2 T2 = new Thread2(obj);

        T1.start();
        T2.start();
    }
}
