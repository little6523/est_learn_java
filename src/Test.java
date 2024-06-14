import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    // ------------------------- 1교시 -------------------------

    // ------------------------- 1교시 -------------------------
    // ------------------------- 2교시 -------------------------
    try {
      int result = 10 / 0;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println("정상적으로 종료되었습니다.");
    // ------------------------- 2교시 -------------------------

  }
}
