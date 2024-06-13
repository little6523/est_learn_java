public class Dog extends Animal {

  int age;

  void sleep(int times) {
    System.out.println(name + " zzz...." + times + " hours");
  }

  public Dog() {
    super("okay", "남");
    this.age = 0;
  }
}
