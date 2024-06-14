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
    //    try {
    //      int[] numbers = {1, 2, 3};
    //      System.out.println(numbers[5]);
    //    } catch (ArrayIndexOutOfBoundsException e) {
    //      System.out.println("배열의 인덱스를 벗어났습니다.");
    //    }
    // ------------------------- 4교시 -------------------------
    // ------------------------- 5교시 -------------------------
    //    사용자로부터 두 개의 정수를 입력받아 나눗셈을 수행하는 프로그램을 작성하세요.
    //    이때, 두 번째 정수가 0인 경우 ArithmeticException을 처리하여 적절한 메시지를 출력하세요.
    //    Scanner sc = new Scanner(System.in);
    //
    //    try {
    //      System.out.println("첫 번째 정수를 입력하세요: ");
    //      int a = sc.nextInt();
    //
    //      System.out.println("두 번째 정수를 입력하세요: ");
    //      int b = sc.nextInt();
    //      if (b == 0) {
    //        throw new ArithmeticException();
    //      }
    //      System.out.println("a / b = " + (a / b));
    //    } catch (ArithmeticException e) {
    //      System.out.println("두 번째 정수가 0이므로 나눌 수 없습니다.");
    //    } finally {
    //      sc.close();
    //    }

    //    사용자로부터 정수 배열의 크기와 배열 요소를 입력받아 배열을 생성하는 프로그램을 작성하세요.
    //    이때, 입력된 인덱스가 배열의 크기를 벗어나면 ArrayIndexOutOfBoundsException을 처리하여 적절한 메시지를 출력하세요.
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("배열의 크기를 입력");
      int size = sc.nextInt();
      int[] arr = new int[size];

      System.out.println("배열의 요소를 입력");
      for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.println("배열에 접근할 인덱스를 입력");
      int idx = sc.nextInt();
      if (idx >= size) {
        throw new ArrayIndexOutOfBoundsException();
      }
      System.out.println(idx + "번째 값은 " + arr[idx]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("입력하신 인덱스가 배열의 크기를 벗어났습니다.");
    } finally {
      System.out.println("프로그램이 종료되었습니다.");
      sc.close();
    }
    // ------------------------- 5교시 -------------------------

  }

  private static int divide(int a, int b) throws ArithmeticException {
    if (a / b == 0) {
      throw new ArithmeticException();
    } else {
      throw new NullPointerException();
    }
  }
}
