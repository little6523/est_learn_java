package java_0611;

public class Person_20240611 {

  String name;
  int phoneNumber;
  int money;
  int age;

  // 생성자
  public Person_20240611(String name, int phoneNumber, int money, int age) {
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

  public void teaching(Student_20240611 student) {
    student.levelUp();
  }

  public void cheating(Student_20240611 student) {
    student.levelDown();
  }
}
