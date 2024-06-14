package dailyQuiz_20240614;

import java.util.Scanner;

public class DailyQuiz_20240614 {
  public void quiz() {
    Scanner sc = new Scanner(System.in);
    try {
      String alphabet = sc.nextLine();

      int idx = 0;
      for (char c : alphabet.toCharArray()) {
        int ascii = c;
        if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
          System.out.print(c);
        } else {
          System.out.println("\n" + idx + "번째 인덱스에서 알파벳이 아닌 문자 발견: " + c);
          throw new InputNotAlphabetException();
        }
        idx++;
      }
    } catch (InputNotAlphabetException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("\n시스템을 종료합니다.");
      sc.close();
    }
  }
}
