package java_0613;

public class Cat extends Animal1 {

  public Cat() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("miumiu");
  }
}
