package p1;

public class Person {

  private String name2;
  String name;
  int age;
  final String test;
  int gold = 999999999;
  static final double PI = 3.14159;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.test = "123";
  }

  private String checkAmount(int amount) {
    if (amount > this.gold) {
      return "요청하신 금액이 너무 큽니다.";
    }
    return "정상처리되었습니다.";
  }

  public String deposit(int amount) {
    return checkAmount(amount);

  }

  public static void say() {
    System.out.println("good");
  }

  public void sayHello() {
    System.out.println("Hello my name is " + this.name);
  }

  public void introduce() {
    System.out.println("I am " + this.age + " years old.");
  }

  protected void testMethod() {
    System.out.println("test");
  }
}
