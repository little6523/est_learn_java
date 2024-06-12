public class Car_20240611 {

  private String name;
  private String color;
  private int speed;

  public Car_20240611(String name, String color, int speed) {
    this.name = name;
    this.color = color;
    this.speed = speed;
  }

  public void printName() {
    System.out.println("제가 타고다니는 차는 " + this.name + " 입니다.");
  }

  public void changeColor(String color) {
    String beforeColor = this.color;
    this.color = color;
    System.out.println("색을 " + beforeColor + "에서 " + color + "로 바꿨습니다.");
  }

  public void printSpeed() {
    System.out.println("현재 속도 = " + this.speed + "km/h입니다.");
  }

  public void upSpeed(int speed) {
    this.speed += speed;
    printSpeed();
  }

  public void downSpeed(int speed) {
    this.speed -= speed;
    printSpeed();
  }
}
