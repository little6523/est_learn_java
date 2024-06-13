//public class Car_20240612 {
//  private int speed = 100;
//  private int gear;
//
//  private String wheel;
//  private int cc;
//  private String logo;
//  private String engine;
//  private boolean isStop;
//
//  public double getSpeed() {
//    return this.speed * 1.6;
//  }
//
//  public void setSpeed(int speed) {
//    this.speed = speed;
//  }
//
//  public void setGear(int gear) {
//    this.gear = gear;
//  }
//
//  public void setWheel(String wheel) {
//    this.wheel = wheel;
//  }
//
//  public void setCc(int cc) {
//    this.cc = cc;
//  }
//
//  public void setLogo(String logo) {
//    this.logo = logo;
//  }
//
//  public void setEngine(String engine) {
//    this.engine = engine;
//  }
//
//  public int getGear() {
//    return gear;
//  }
//
//  public String getWheel() {
//    return wheel;
//  }
//
//  public int getCc() {
//    return cc;
//  }
//
//  public String getLogo() {
//    return logo;
//  }
//
//  public String getEngine() {
//    return engine;
//  }
//
//  //  public Car(int speed) {
//  //    this.speed = speed;
//  //    this.gear = 1;
//  //  }
//
//  public void setSpeed(int gear, int speed) {
//    // 내가 짠 코드
//    int maxSpeed = 1000;
//    int minSpeed = 0;
//
//    if (gear == 1) {
//      maxSpeed = 30;
//    } else if (gear == 2) {
//      maxSpeed = 70;
//      minSpeed = 31;
//    } else if (gear == 3) {
//      maxSpeed = 120;
//      minSpeed = 71;
//    }
//
//    if (speed < minSpeed) {
//      this.speed = minSpeed;
//    } else if (speed > maxSpeed) {
//      this.speed = maxSpeed;
//    } else {
//      this.speed = speed;
//    }
//  }
//
//   강사님 코드
//        if (speed < 0) {
//          this.speed = 0;
//          return;
//        }
//        this.speed = speed;
//
//        if (speed <= 30) {
//          this.gear = 1;
//        } else if (speed <= 70) {
//          this.gear = 2;
//        } else {
//          this.gear = 3;
//        }
//      }
//
//  public void checkSpeed() {
//    System.out.println(this.speed);
//  }
//}
