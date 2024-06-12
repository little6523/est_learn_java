public class Person {

  String name;
  int age;
  static final String gender = "남";

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello my name is " + this.name);
  }

  public void introduce() {
    System.out.println("I am " + this.age + " years old.");
  }
}
