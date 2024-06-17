package java_0617;

public class Java_0617 {

    public void learn() {
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
        //    KiaCar kiaCar = new KiaCar();
        //    System.out.println(kiaCar.getTire());
        //    System.out.println(kiaCar.showEngine());
        //    System.out.println(kiaCar.amountNavi());
        // --------------------- 2교시 ---------------------
        // --------------------- 3교시 ---------------------
        //    InterfaceC impleC = new ImpleC();
        //    impleC.showA();

        //    ProfileService profileService = new ProfileService();
        //    profileService.saveProfile(new ProfileMemoryRepository());
        // --------------------- 3교시 ---------------------
        // --------------------- 4교시 ---------------------

        //    ArrayList<Animal> stringArrayList = new ArrayList<>();
        //    stringArrayList.add(new Lion());
        //
        //    List list = new ArrayList<>();
        //    String o = (String) list.get(0);

        // --------------------- 4교시 ---------------------
        // --------------------- 5교시 ---------------------
        //    java_0617.Box box = new java_0617.Box();
        //    box.set("hello");
        //
        //    Object o = box.get();
        //
        //    java_0617.Box<String> stringBox = new java_0617.Box<>();
        //    java_0617.Box<Integer> integerBox = new java_0617.Box<>();
        //    integerBox.set(6);
        //    int i = integerBox.get();
        //    System.out.println(integerBox.isIns());
        //
        //    Car<String> car = new Car<>();
        //    car.set("람보르기니");
        //    System.out.println(car.get());

        // --------------------- 5교시 ---------------------
        // --------------------- 6교시 ---------------------

        Box<Integer> boxing = Util.boxing(100);
        Box<String> boxing1 = Util.boxing("212312313");

        // --------------------- 6교시 ---------------------
    }
}
