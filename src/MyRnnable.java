public class MyRnnable implements Runnable {

  private int number;

  public MyRnnable(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    System.out.println(this.number);
  }
}
