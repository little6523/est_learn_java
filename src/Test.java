import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    // ------------------------- 1교시 -------------------------

    // ------------------------- 1교시 -------------------------
    // ------------------------- 2교시 -------------------------
    //    try {
    //      int result = 10 / 0;
    //      System.out.println(result);
    //    } catch (ArithmeticException e) {
    //      System.out.println("0으로 나눌 수 없습니다.");
    //    }
    //    System.out.println("정상적으로 종료되었습니다.");
    // ------------------------- 2교시 -------------------------
    // ------------------------- 3교시 -------------------------

    //    try {
    //      divide(10, 0);
    //    } catch (ArithmeticException e) {
    //      System.out.println("0으로 나눌 수 없습니다.");
    //    } catch (NullPointerException ex) {
    //      System.out.println("null입니다.");
    //    }
    //    System.out.println("정상적으로 종료되었습니다.");

    //    Scanner scanner = new Scanner(System.in);
    //    try {
    //      int i = scanner.nextInt();
    //      int result = i / 0;
    //      System.out.println(result);
    //    } catch (NullPointerException e) {
    //      System.out.println("0으로 나눌 수 없습니다.");
    //    } finally{
    //      System.out.println("스캐너를 종료합니다.");
    //      scanner.close();
    //    }
    // ------------------------- 3교시 -------------------------
    // ------------------------- 4교시 -------------------------
    try {
      int[] numbers = {1, 2, 3};
      System.out.println(numbers[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 인덱스를 벗어났습니다.");
    }
    // ------------------------- 4교시 -------------------------

  }

  private static int divide(int a, int b) throws ArithmeticException {
    if (a / b == 0) {
      throw new ArithmeticException();
    } else {
      throw new NullPointerException();
    }
  }
}
