import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    // ------------------------- 1교시 -------------------------
    //    InheritB inheritB = new InheritB();
    //
    //    inheritB.field2 = "필드2";
    //    inheritB.method2();
    //
    //    inheritB.field1 = 100;
    //    inheritB.method1();

    // 부모 (parent) 클래스를 구현하고 money 멤버변수 를 가지고 있고 저축한다 라는 메서드를 가지고있는데 해당 메서드는  money 를 10000원씩 추가하는
    // 로직을 갖고있다
    // 자식(child) 클래스를 구현하고 부모 클래스를 상속 받아 투자한다라는 메서드를 가지고 있는데 해당 메서드는 money를 1000원을 뺴는 로직을 갖고있다.
    //    Child child = new Child();
    //    child.saveMoney();
    //    child.invest();
    // ------------------------- 1교시 -------------------------
    // ------------------------- 2교시 -------------------------
    //    Dog dog = new Dog();
    //
    //    dog.setName("용팔이");
    //
    //    dog.sleep();
    //    dog.sleep(100);
    // ------------------------- 2교시 -------------------------
    // ------------------------- 3교시 -------------------------
    //    Student student = new Student("승조", "a", 1);
    //
    //    System.out.println(student.name);
    //    System.out.println(student.ssn);
    //    System.out.println(student.studentNo);
    // ------------------------- 3교시 -------------------------
    // ------------------------- 4교시 -------------------------
    //    Child1 child = new Child1();
    //
    //    child.method1();
    //    child.method2();
    //    child.method3();

    //    Computer computer = new Computer();
    //    computer.say();
    //    int r = 10;
    //    Calculator calculator = new Calculator();
    //    System.out.println("원면적" + calculator.areaCircle(r));
    //    System.out.println();
    //
    //    Computer computer = new Computer();
    //    System.out.println("원면적" + computer.areaCircle(r));
    // ------------------------- 4교시 -------------------------
    // ------------------------- 5교시 -------------------------
    SmartPhone smartPhone = new SmartPhone("김승조");

    smartPhone.turnOn();
    smartPhone.turnOff();
    smartPhone.internetSearch();

    // ------------------------- 5교시 -------------------------
    // ------------------------- 6교시 -------------------------

    // ------------------------- 6교시 -------------------------
  }
}
