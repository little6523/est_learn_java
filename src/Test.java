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
    Dog dog = new Dog();

    dog.setName("용팔이");

    dog.sleep();
    dog.sleep(100);
    // ------------------------- 2교시 -------------------------
  }
}
