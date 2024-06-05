import java.util.*;
import java.util.stream.Stream;

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
    //    Scanner sc = new Scanner(System.in);
    //
    //    System.out.println("정수를 입력해주세요.");
    //    int number = sc.nextInt();
    //
    //    System.out.println("제가 입력한 값은 " + number + "입니다.");
    //
    //    sc.close();
    // --------------------------------------------실습 2--------------------------------
    // --------------------------------------------실습 3--------------------------------
    //    Scanner sc = new Scanner(System.in);
    //
    //    System.out.println("정수를 입력하세요.");
    //    int number = sc.nextInt();
    //    sc.nextLine();
    //    System.out.println("문자열을 입력하세요:");
    //
    //    String line = sc.nextLine();
    //
    //    System.out.println("정수는 = " + number);
    //
    //    System.out.println("문자열은 = " + line);
    //
    //    sc.close();

    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("1에서 4사이의 숫자를 입력하세요.");
    //
    //    int weather = sc.nextInt();
    //    sc.nextLine();
    //    switch (weather) {
    //      case 1:
    //        System.out.println("봄");
    //        break;
    //      case 2:
    //        System.out.println("여름");
    //        break;
    //      case 3:
    //        System.out.println("가을");
    //        break;
    //      case 4:
    //        System.out.println("겨울");
    //        break;
    //      default:
    //        System.out.println("잘못된 입력입니다!");
    //    }
    //    sc.close();
    // --------------------------------------------실습 3--------------------------------
    // --------------------------------------------실습 4--------------------------------
    //    Random random = new Random();
    //
    //    int i = random.nextInt(6)+1;
    //
    //    System.out.println(i);

    Random random = new Random();
    ArrayList<Integer> lotto = new ArrayList<>();
    while (lotto.size() < 6) {
      int num = random.nextInt(45) + 1;
      if (!lotto.contains(num)){
        lotto.add(num);
      }
    }
    Collections.sort(lotto);
    System.out.print("로또 번호: ");
    for (int num : lotto) {
      System.out.print(num + " ");
    }

    // int -> Integer : boxing
    // Integer -> int : unboxing

    // --------------------------------------------실습 4--------------------------------
    // --------------------------------------------실습 5--------------------------------

    // --------------------------------------------실습 5--------------------------------
    // --------------------------------------------실습 6--------------------------------

    // --------------------------------------------실습 6--------------------------------
  }
}
