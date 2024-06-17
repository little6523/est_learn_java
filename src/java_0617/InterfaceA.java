package java_0617;

public interface InterfaceA {
  void methodA();

  default void showA() {
    System.out.println("okay");
  }
}
