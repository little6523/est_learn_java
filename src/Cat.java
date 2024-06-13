public class Cat extends Animal2 {

  public Cat() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("miumiu");
  }
}
