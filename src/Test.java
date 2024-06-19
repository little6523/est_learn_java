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

    //    Map<String, Integer> map = new HashMap<>();
    //
    //    map.put("홍길동", 30);
    //    map.put("홍길동", 40);
    //
    //    System.out.println(map.get("홍길동"));
    //    System.out.println(map.remove("홍길동"));
    //
    //    Map<String, List<String>> map2 = new HashMap<>();
    //    List<String> stringList = new ArrayList<>();
    //
    //    stringList.add("홍길동");
    //    stringList.add("홍길동");
    //    stringList.add("홍길동");
    //    map2.put("홍길동", stringList);
    //
    //    Set<String> strings = map2.keySet();
    //    Iterator<String> iterator = strings.iterator();
    //
    //    while (iterator.hasNext()) {
    //      String next = iterator.next();
    //      List<String> stringList1 = map2.get(next);
    //      System.out.println(stringList);
    //    }

    // ----------------- 3교시 -------------------------
    // ----------------- 4교시 -------------------------
    //    Map<String, List<String>> map2 = new HashMap<>();
    //    List<String> stringList = new ArrayList<>();
    //
    //    stringList.add("홍길동");
    //    stringList.add("홍길동");
    //    stringList.add("홍길동");
    //    map2.put("키1", stringList);
    //
    //    Set<Map.Entry<String, List<String>>> entries = map2.entrySet();
    //
    //    for(Map.Entry<String,List<String>> entry:entries){
    //      String key = entry.getKey();
    //      List<String> value = entry.getValue();
    //      System.out.println(key);
    //      System.out.println("========");
    //      System.out.println(value);
    //    }

    //    Map<String, Integer> map = new HashMap<>();
    //
    //    map.put("홍길동", 80);
    //    map.put("카리나", 85);
    //    map.put("제시카", 95);
    //    map.put("홍길동", 80); // "홍길동" 키가 같기 때문에 가장 마지막에 저장한 값으로 엎어씀
    //    System.out.println("총 Entry 수: " + map.size()); // 저장된 총 Entry 수 얻기
    //
    //    // 2. 객체 찾기
    //    System.out.println("\t홍길동: " + map.get("홍길동"));
    //    System.out.println();
    //
    //    // 3. 객체를 하나씩 처리
    //    Set<String> keySet = map.keySet();
    //    Iterator<String> iterator = keySet.iterator();
    //    while (iterator.hasNext()) {
    //      String key = iterator.next();
    //      Integer value = map.get(key);
    //      System.out.println("\t" + key + ": " + value);
    //    }
    //    System.out.println();
    //
    //    // 4. 객체 삭제
    //    map.remove("홍길동");
    //    System.out.println("총 Entry 수: " + map.size());
    //
    //    // 5. 객체를 하나씩 처리
    //    Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.EntrySet 얻기
    //    for (Map.Entry<String, Integer> entry : entrySet) {
    //      String key = entry.getKey();
    //      Integer value = entry.getValue();
    //      System.out.println("\t" + key + ": " + value);
    //    }
    //    System.out.println();
    //
    //    // 6. 모든 Map.Entry 삭제
    //    map.clear();
    //    System.out.println("총 Entry 수: " + map.size());

    //    Map<Student, Integer> students = new HashMap<>();
    //
    //    students.put(new Student(1, "가나다"), 100);
    //    students.put(new Student(2, "라마바"), 100);
    //    students.put(new Student(3, "사아자"), 100);
    //    students.put(new Student(4, "차카타"), 100);
    //    students.put(new Student(5, "파하하"), 100);
    //
    //    System.out.println(students.size());
    //
    //    Set<Map.Entry<Student, Integer>> studentsSet = students.entrySet();
    //    for (Map.Entry<Student, Integer> entry : studentsSet) {
    //      String key = entry.getKey().getName();
    //      int no = entry.getKey().getNo();
    //      Integer value = entry.getValue();
    //      System.out.println("\t" + key + ": " + no);
    //    }

    // ----------------- 4교시 -------------------------
    // ----------------- 5교시 -------------------------

    //    Map<String, String> map = new Hashtable<>();
    //    Scanner sc = new Scanner(System.in);
    //
    //    map.put("spring", "qwer");
    //    map.put("summer", "qwer1234");
    //    map.put("fall", "qwer123");
    //    map.put("winter", "qwer123");
    //
    //    while (true) {
    //      System.out.println("아이디와 비밀번호를 입력해주세요.");
    //      System.out.println("아이디 : ");
    //      String id = sc.nextLine();
    //
    //      System.out.println("비밀번호 : ");
    //      String password = sc.nextLine();
    //
    //      System.out.println("===============");
    //
    //      if (map.containsKey(id)) {
    //        String mapPassword = map.get(id);
    //        if (mapPassword.equals(password)) {
    //          System.out.println("로그인에 성공했습니다.");
    //          break;
    //        } else {
    //          System.out.println("비밀번호가 틀렸습니다.");
    //        }
    //
    //      } else {
    //        System.out.println("입력하신 아이디가 존재하지 않습니다.");
    //      }
    //    }

    // ----------------- 5교시 -------------------------
    // ----------------- 6교시 -------------------------

    //    Stack<Coin> coinStack = new Stack<>();
    //
    //    coinStack.push(new Coin(100));
    //    coinStack.push(new Coin(500));
    //    coinStack.push(new Coin(10));
    //    coinStack.push(new Coin(50));
    //
    //    while (!coinStack.isEmpty()) {
    //      Coin coin = coinStack.pop();
    //      System.out.println(coin.getValue());
    //    }
    //
    //    Queue<Coin> coinQueue = new LinkedList<>();
    //    coinQueue.offer(new Coin(100));
    //    coinQueue.offer(new Coin(500));
    //    coinQueue.offer(new Coin(10));
    //    coinQueue.offer(new Coin(50));
    //    while (!coinQueue.isEmpty()) {
    //      Coin coin = coinQueue.poll();
    //      System.out.println(coin.getValue());
    //    }

    Queue<Message> messageQueue = new LinkedList<>();

    messageQueue.offer(new Message("sendMail", "홍길동"));
    messageQueue.offer(new Message("sendSms", "제니"));
    messageQueue.offer(new Message("sendKakaoTalk", "리사"));
    messageQueue.offer(new Message("sendWeeklyQuiz", "김승조"));

    while (!messageQueue.isEmpty()) {
      Message message = messageQueue.poll();
      switch (message.getCommand()) {
        case "sendMail":
          System.out.println(message.getTo() + "메일을 보냅니다.");
          break;
        case "sendSms":
          System.out.println(message.getTo() + "SMS를 보냅니다.");
          break;
        case "sendKakaoTalk":
          System.out.println(message.getTo() + "카톡을 보냅니다.");
          break;
        default:
          System.out.println(message.getTo() + "아무거나 보냅니다.");
          break;
      }
    }
    // ----------------- 6교시 -------------------------
  }
}
