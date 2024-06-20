import java.util.*;

public class Test {
  public static void main(String[] args) throws InterruptedException {
    // -------------------- 3교시 --------------------
    //    MyThread myThread = new MyThread("스레드");
    //    MyThread myThread1 = new MyThread("스레드1");
    //    MyThread myThread2 = new MyThread("스레드2");
    //    MyThread myThread3 = new MyThread("스레드3");
    //    MyThread myThread4 = new MyThread("스레드4");
    //
    //    myThread.start();
    //    myThread1.start();
    //    myThread2.start();
    //    myThread3.start();
    //    myThread4.start();
    // -------------------- 3교시 --------------------
    // -------------------- 4교시 --------------------
    //    Thread thread1 = new Thread(new MyRnnable(1));
    //    Thread thread2 = new Thread(new MyRnnable(2));
    //    Thread thread3 = new Thread(new MyRnnable(3));
    //    Thread thread4 = new Thread(new MyRnnable(4));
    //    Thread thread5 = new Thread(new MyRnnable(5));
    //
    //    thread1.start();
    //    thread2.start();
    //    Thread.sleep(10000);
    //    thread3.start();
    //    thread4.start();
    //    thread5.start();

    //    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    //
    //    callList(list);

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    numbers.removeIf(integer -> integer % 2 == 0);
    System.out.println(numbers);

    //    Iterator<Integer> iterator = numbers.iterator();
    //
    //    while (iterator.hasNext()) {
    //      Integer next = iterator.next();
    //      if (next % 2 == 0) {
    //        iterator.remove();
    //      }
    //    }
    //    System.out.println(numbers);
    // -------------------- 4교시 --------------------
  }

  public static void callList(List<Integer> integerList) {
    for (int i : integerList) {
      System.out.println(i);
    }
  }
}
