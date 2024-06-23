package java_0620;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java_0620 {

    public void learn() {
        // -------------------- 3교시 --------------------
        //    java_0620.MyThread myThread = new java_0620.MyThread("스레드");
        //    java_0620.MyThread myThread1 = new java_0620.MyThread("스레드1");
        //    java_0620.MyThread myThread2 = new java_0620.MyThread("스레드2");
        //    java_0620.MyThread myThread3 = new java_0620.MyThread("스레드3");
        //    java_0620.MyThread myThread4 = new java_0620.MyThread("스레드4");
        //
        //    myThread.start();
        //    myThread1.start();
        //    myThread2.start();
        //    myThread3.start();
        //    myThread4.start();
        // -------------------- 3교시 --------------------
        // -------------------- 4교시 --------------------
        //    Thread thread1 = new Thread(new java_0620.MyRunnable(1));
        //    Thread thread2 = new Thread(new java_0620.MyRunnable(2));
        //    Thread thread3 = new Thread(new java_0620.MyRunnable(3));
        //    Thread thread4 = new Thread(new java_0620.MyRunnable(4));
        //    Thread thread5 = new Thread(new java_0620.MyRunnable(5));
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
        //
        //    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //
        //    numbers.removeIf(integer -> integer % 2 == 0);
        //    System.out.println(numbers);
        //
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
        // -------------------- 5교시 --------------------
        //    List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 10, 9, 5, 20));
        //
        //    numbers.stream().filter(integer -> integer % 2 == 0);
        //    numbers.stream().map(integer -> integer * 2);
        //    numbers.stream().sorted();
        //
        //    numbers.stream()
        //        .filter(integer -> integer % 2 == 0)
        //        .forEach(integer -> System.out.println(integer));
        //
        //    List<Integer> collect =
        //        numbers.stream().map(integer -> integer * 2).collect(Collectors.toList());
        //
        //    for (int i : collect) {
        //      System.out.println(i);
        //    }
        //
        //    numbers.stream().sorted().forEach(integer -> System.out.println(integer));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> num =
                numbers.stream().filter(integer -> integer % 2 != 0).collect(Collectors.toList());
        System.out.println(num);

        numbers.stream()
                .filter(integer -> integer % 2 != 0)
                .collect(Collectors.toList())
                .forEach(integer -> System.out.println(integer));

        numbers.stream()
                .filter(integer -> integer % 2 == 1)
                .forEach(integer -> System.out.println(integer));

        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");
        words.stream()
                .filter(string -> string.length() <= 5)
                .forEach(string -> System.out.println(string));

        // -------------------- 5교시 --------------------
    }

    public static void callList(List<Integer> integerList) {
        for (int i : integerList) {
            System.out.println(i);
        }
    }
}
