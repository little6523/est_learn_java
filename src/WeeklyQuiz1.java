import java.util.InputMismatchException;
import java.util.Scanner;

public class WeeklyQuiz1 {
  public void learn() {
    Scanner sc = new Scanner(System.in);
    int selectFunction = 0;
    int firstNumber, secondNumber = 0;

    while (true) {
      while (true) {
        System.out.println("원하는 기능을 선택하세요");
        System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
        try {
          selectFunction = sc.nextInt();
          if (selectFunction >= 0 && selectFunction <= 4) {
            break;
          } else {
            System.out.println("올바른 입력이 아닙니다.");
          }
        } catch (InputMismatchException e) {
          System.out.println("올바른 입력이 아닙니다.");
          sc.nextLine();
        }
      }

      // selectFunction == 0 -> 종료
      if (selectFunction == 0) {
        break;
      }

      while (true) {
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        try {
          firstNumber = sc.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("올바른 입력이 아닙니다.");
          sc.nextLine();
        }
      }

      while (true) {
        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
        try {
          secondNumber = sc.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("올바른 입력이 아닙니다.");
          sc.nextLine();
        }
      }

      switch (selectFunction) {
        case 1:
          System.out.printf(
                  "%d + %d = %d\n", firstNumber, secondNumber, firstNumber + secondNumber);
          break;
        case 2:
          System.out.printf(
                  "%d - %d = %d\n", firstNumber, secondNumber, firstNumber - secondNumber);
          break;
        case 3:
          System.out.printf(
                  "%d * %d = %d\n", firstNumber, secondNumber, firstNumber * secondNumber);
          break;
        case 4:
          System.out.printf(
                  "%d / %d = %.2f\n", firstNumber, secondNumber, (double)firstNumber / secondNumber);
      }
    }
  }
}
