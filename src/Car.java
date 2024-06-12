public class Car {
  private int speed;

  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
    } else {
      this.speed = speed;
    }
  }
  public void checkSpeed() {
    System.out.println(this.speed);
  }
}
