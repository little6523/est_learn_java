import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    // --------------------------------------------실습 1--------------------------------
    //    int i = 1;
    //    while (i <= 5) {
    //      System.out.println("현재 i의 값은 = "+ i);
    //      i++;
    //    }

    //    int i = 10;
    //    while (i >= 0) {
    //      System.out.println("현재 카운트 : "+ i);
    //      i--;
    //    }
    //    System.out.println("카운트 종료");

//    int i = 1;
//    int res = 0;
//    int n = 100;
//
//    while (i <= n) {
//      res += i;
//      i += 1;
//    }
//    System.out.println(res);

    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    int sum = 0;
    int i = 0;
    while (i < numbers.length) {
      sum += numbers[i];
      i++;
    }
    System.out.println(sum/numbers.length);
    // --------------------------------------------실습 1--------------------------------
    // --------------------------------------------실습 2--------------------------------

    // --------------------------------------------실습 2--------------------------------
  }
}
