import java_0618.Course;
import java_0618.Student;
import java_0618.Worker;

import java.util.*;

public class Test {
  public static void main(String[] args) {
    // ----------------- 1교시 -------------------------
    //    Set<Integer> integerSet = new HashSet<>();
    //
    //    integerSet.add(1);
    //    integerSet.add(2);
    //    integerSet.add(3);
    //    integerSet.add(4);
    //    integerSet.add(5);
    //
    //    Iterator<Integer> iterator = integerSet.iterator();
    //
    //    while(iterator.hasNext()) {
    //      iterator.next();
    //      iterator.remove();
    //    }
    //
    //    while(iterator.hasNext()) {
    //      System.out.println(iterator.next());
    //    }
    //
    //    Set<String> stringsSet = new HashSet<>();
    //
    //    stringsSet.add("Java");
    //    stringsSet.add("Spring");
    //    stringsSet.add("JSP");
    //    stringsSet.add("Java");
    //    stringsSet.add("DBMS");
    //
    //    System.out.println(stringsSet.size());
    //
    //    stringsSet.remove("Java");
    //
    //    Iterator<String> iterator2 = stringsSet.iterator();
    //    while(iterator2.hasNext()) {
    //      System.out.println(iterator2.next());
    //    }
    //
    //    stringsSet.clear();
    //
    //    if(stringsSet.isEmpty()) {
    //      System.out.println("비었습니다.");
    //    } else {
    //      System.out.println("비지 않았습니다.");
    //    }
    // ----------------- 1교시 -------------------------
    // ----------------- 2교시 -------------------------

    //      Set<Member> set = new HashSet<>();
    //
    //      set.add(new Member("홍길동", 31));
    //      set.add(new Member("홍길동", 30));
    //
    //      System.out.println("총 객체수: " + set.size());

    // ----------------- 2교시 -------------------------
    // ----------------- 3교시 -------------------------

    Map<String, Integer> map = new HashMap<>();

    map.put("홍길동", 30);
    map.put("홍길동", 40);

    System.out.println(map.get("홍길동"));
    System.out.println(map.remove("홍길동"));

    Map<String, List<String>> map2 = new HashMap<>();
    List<String> stringList = new ArrayList<>();

    stringList.add("홍길동");
    stringList.add("홍길동");
    stringList.add("홍길동");
    map2.put("홍길동", stringList);

    Set<String> strings = map2.keySet();
    Iterator<String> iterator = strings.iterator();

    while (iterator.hasNext()) {
      String next = iterator.next();
      List<String> stringList1 = map2.get(next);
      System.out.println(stringList);
    }

    // ----------------- 3교시 -------------------------
  }
}
