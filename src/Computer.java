public class Computer extends Calculator {

  @Override
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle 메소드 실행");
    return Math.PI * r * r;
  }

  @Override
  void say() {
    System.out.println("I'm Child of Computer");
  }
}
