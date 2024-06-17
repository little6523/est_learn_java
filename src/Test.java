public class Test {
  public static void main(String[] args) {
    // --------------------- 1교시 ---------------------
    //    Phone applePhone = new ApplePhone();
    //    Phone samsungPhone = new SamsungPhone();
    //    System.out.println(applePhone.call());
    //    System.out.println(samsungPhone.call());
    // --------------------- 1교시 ---------------------
    // --------------------- 2교시 ---------------------
    //    InterfaceC impleC = new ImpleC();
    //
    //    InterfaceA interfaceA = impleC;
    //    interfaceA.methodA();
    //    System.out.println("=================");
    //
    //    InterfaceB interfaceB = impleC;
    //    interfaceB.methodB();
    //    System.out.println("=================");
    //
    //    impleC.methodA();
    //    impleC.methodB();
    //    impleC.methodC();

    // KiaCar 라는 구현체클래스를 만든다
    // 이 구현체는 Car 라는 인터페이스를 구현한다.
    // Car 인터페이스는 Tier, Engine, Navi 라는 각 인터페이스를 상속받는다.
    KiaCar kiaCar = new KiaCar();
    System.out.println(kiaCar.getTire());
    System.out.println(kiaCar.showEngine());
    System.out.println(kiaCar.amountNavi());
    // --------------------- 2교시 ---------------------

  }
}
