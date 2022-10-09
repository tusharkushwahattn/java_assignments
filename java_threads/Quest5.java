
// // 5). Write a program to simulate a deadlock in java and then improve the
// program to handle the deadlock using reentract lock.
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Quest5 {
private Lock lock1 = new ReentrantLock(true);
private Lock lock2 = new ReentrantLock(true);

public static void main(String[] args) {
simulate deadlock = new simulate();
new Thread(deadlock::operation1, "Thread1").start();
new Thread(deadlock::operation2, "Thread2").start();
}

public void operation1() {
lock1.lock();
System.out.println("lock1 acquired, waiting to lock lock2");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
throw new RuntimeException(e);
}
System.out.println("lock2 acquired");
lock2.unlock();
lock1.unlock();
}

public void operation2() {
lock2.lock();
System.out.println("Lock2 acquired, waiting to lock lock1");
try {
Thread.sleep(50);
} catch (InterruptedException e) {
throw new RuntimeException(e);
}
lock1.lock();
System.out.println("lock1 acquired");
lock1.unlock();
lock2.unlock();
}
}
