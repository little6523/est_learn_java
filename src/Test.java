import org.w3c.dom.ranges.Range;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Test {
  public static void main(String[] args) {
    // -------------------------- 1교시 ------------------------------
    //    int okay = okay(1, 2);
    // -------------------------- 1교시 ------------------------------
    // -------------------------- 2교시 ------------------------------
    //    Test2 test2 = new Test2();
    //    System.out.println(test2.b);
    //    System.out.println(test2.good());
    //    Test2.call();
    //    Test2 test2 = new Test2();
    // -------------------------- 2교시 ------------------------------
    // -------------------------- 3교시 ------------------------------
    //    System.out.println(args[0]);

    //    test2
    //    첫번 째 메서드 더하기 기능(파라미터는 정수 a, b를 받는다)
    //    두번 째 메서드 뺴기 기능(파라미터는 정수 a, b를 받는다)
    //    test 클래스에서는
    //
    //    해당 기능을 호출 해서 메서드에 아규먼트로 임의의 값을 넣어서 메서드를 실행한다
    //    Test2 test2 = new Test2();
    //    System.out.println(test2.add(1, 2));
    //    System.out.println(test2.sub(10, 5));
    // -------------------------- 3교시 ------------------------------
    // -------------------------- 4교시 ------------------------------
    Person person1 = new Person("이현준", 0101000100, 5000, 26);
    Person person2 = new Person("김철수", 0101520100, 23113, 10);
    Person person3 = new Person("후하하", 0101522300, 999999, 30);
    Person person4 = new Person("아저씨", 0101646341, 256532, 50);
    //
    //    person1.sayHello();
    //    person2.sayHello();
    //
    //    person1.sayMoney();
    //    person2.sayMoney();
    // -------------------------- 4교시 ------------------------------
    // -------------------------- 5교시 ------------------------------
    //    Student student = new Student();
    //
    //    person1.teaching(student);
    //    person1.teaching(student);
    //
    //    person1.cheating(student);
    //    person1.cheating(student);
    // -------------------------- 5교시 ------------------------------
    // -------------------------- 6교시 ------------------------------

    Scanner scanner = new Scanner(System.in);

    System.out.println("계좌번호를 입력하세요: ");
    String accountNumber = scanner.nextLine();
    System.out.println("소유자 이름을 입력하세요: ");
    String ownerName = scanner.nextLine();
    BankAccount account = new BankAccount(accountNumber, ownerName);

    account.deposit(100000);
    account.withdraw(50000);

    account.printBalance();

    scanner.close();

    // -------------------------- 6교시 ------------------------------

  }

  // -------------------------- 1교시 ------------------------------
  //  static int okay(int a, int b) {
  //    System.out.println(a + b);
  //
  //    return 1;
  //  }
  //
  //  static int add(int a, int b) {
  //    return a + b;
  //  }
  //
  //  static int sub(int a, int b) {
  //    return a - b;
  //  }
  //
  //  static int mul(int a, int b) {
  //    return a * b;
  //  }
  //
  //  static int div(int a, int b) {
  //    return a / b;
  //  }
  //
  //  static void login(String email, String password) {
  //
  //  }
  // -------------------------- 1교시 ------------------------------
  // -------------------------- 2교시 ------------------------------
  // Test2 클래스 작성
  // -------------------------- 2교시 ------------------------------
  // -------------------------- 3교시 ------------------------------
  // Test3 add, sub 함수 작성 및 main 메소드에서 실행
  // -------------------------- 3교시 ------------------------------
  // -------------------------- 4교시 ------------------------------
  // Person 클래스 및 생성자 정의
  // -------------------------- 4교시 ------------------------------
  // -------------------------- 5교시 ------------------------------
  // -------------------------- 5교시 ------------------------------
}
