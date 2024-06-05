import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    // --------------------------------------------실습 1--------------------------------
    //    String[] words = {"apple", "banana", "cherry", "durian"};
    //    for (int i = 0; i < words.length - 1; i++) {
    //      System.out.println(i);
    //      for (int j = i + 1; j < words.length; j++) {
    //        System.out.println(words[i] + " " + words[j]);
    //      }
    //    }
    // --------------------------------------------실습 1--------------------------------
    // --------------------------------------------실습 2--------------------------------
    Scanner sc = new Scanner(System.in);

    System.out.println("정수를 입력해주세요.");
    int number = sc.nextInt();

    System.out.println("제가 입력한 값은 " + number + "입니다.");

    sc.close();
    // --------------------------------------------실습 2--------------------------------
  }
}
