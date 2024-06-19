import java_0618.Course;
import java_0618.Student;
import java_0618.Worker;

import java.util.*;

public class Test {
  public static void main(String[] args) {
    Set<Integer> integerSet = new HashSet<>();

    integerSet.add(1);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(4);
    integerSet.add(5);

    Iterator<Integer> iterator = integerSet.iterator();

    while(iterator.hasNext()) {
      iterator.next();
      iterator.remove();
    }

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    Set<String> stringsSet = new HashSet<>();

    stringsSet.add("Java");
    stringsSet.add("Spring");
    stringsSet.add("JSP");
    stringsSet.add("Java");
    stringsSet.add("DBMS");

    System.out.println(stringsSet.size());

    stringsSet.remove("Java");

    Iterator<String> iterator2 = stringsSet.iterator();
    while(iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }

    stringsSet.clear();

    if(stringsSet.isEmpty()) {
      System.out.println("비었습니다.");
    } else {
      System.out.println("비지 않았습니다.");
    }
  }
}
