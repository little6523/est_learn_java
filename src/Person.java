public class Person {

  String name;
  int phoneNumber;
  int money;
  int age;

  // 생성자
  public Person(String name, int phoneNumber, int money, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.money = money;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("My name is " + name);
  }

  public void sayMoney() {
      System.out.println("내가 가지고 있는 돈은 " + money * 10000 + "원이야");
  }
}
