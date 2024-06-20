import java.util.*;

public class Test {
  public static void main(String[] args) {
    // -------------------- 3교시 --------------------
    MyThread myThread = new MyThread("스레드");
    MyThread myThread1 = new MyThread("스레드1");
    MyThread myThread2 = new MyThread("스레드2");
    MyThread myThread3 = new MyThread("스레드3");
    MyThread myThread4 = new MyThread("스레드4");

    myThread.start();
    myThread1.start();
    myThread2.start();
    myThread3.start();
    myThread4.start();
    // -------------------- 3교시 --------------------
  }
}
