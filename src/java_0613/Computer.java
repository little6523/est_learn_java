package java_0613;

public class Computer extends Calculator {

  @Override
  double areaCircle(double r) {
    System.out.println("java_0613.Computer 객체의 areaCircle 메소드 실행");
    return Math.PI * r * r;
  }

  @Override
  void say() {
    System.out.println("I'm Child of java_0613.Calculator");
  }
}
