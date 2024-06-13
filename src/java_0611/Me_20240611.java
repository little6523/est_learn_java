package java_0611;

public class Me_20240611 {

  private String name;
  private int age;
  private int money;
  private String address;
  private String phoneNumber;
  private String bootCamp;

  public Me_20240611(String name, int age, int money, String address, String phoneNumber, String bootCamp) {
    this.name = name;
    this.age = age;
    this.money = money;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.bootCamp = bootCamp;
  }

  public String introduceSelf() {
    return "나의 이름은 " + name + " 입니다.";
  }

  public void increaseAge() {
    age++;
    System.out.println("나이를 먹었습니다. 현재 나이 = " + this.age);
  }

  public void introduceMyCar(Car_20240611 car) {
    car.printName();
  }

  public void inputCarColor(Car_20240611 car, String color) {
    car.changeColor(color);
  }

  public void carAccelerator(Car_20240611 car, int speed) {
    System.out.println(this.name + "이 " + speed + "km/h만큼 액셀을 밟았습니다.");
    car.upSpeed(speed);
  }

  public void carBreak(Car_20240611 car, int speed) {
    System.out.println(this.name + "이 " + speed + "km/h만큼 브레이크를 밟았습니다.");
    car.downSpeed(speed);
  }
}
