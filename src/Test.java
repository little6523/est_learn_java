import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.IntStream;

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

    //    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    //    int sum = 0;
    //    int i = 0;
    //    while (i < numbers.length) {
    //      sum += numbers[i];
    //      i++;
    //    }
    //    System.out.println(sum / numbers.length);
    // --------------------------------------------실습 1--------------------------------
    // --------------------------------------------실습 2--------------------------------
    //    int i = 0;
    //    while (i <= 300) {
    //      i++;
    //      if (i % 3 == 0) {
    //        System.out.println(i);
    //      }
    //    }

    //    int[] numbers = {10, 5, 8, 20, 3, 15, 9 ,2};
    //    int max = 0;
    //    int i = 0;
    //    while(i < numbers.length) {
    //      if(numbers[i] > max) {
    //        max = numbers[i];
    //      }
    //      i++;
    //    }
    //    System.out.println("최댓값: "+ max);

    //    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    //
    //    int posNum = IntStream.of(numbers).filter(num -> num > 0).sum();
    //    int neNum = IntStream.of(numbers).filter(num -> num < 0).sum();
    //    System.out.println(posNum);
    //    System.out.println(neNum);

    //    int i = 0;
    //    int positive = 0;
    //    int negative = 0;
    //    while (i < numbers.length) {
    //      if (numbers[i] > 0){
    //        positive += numbers[i];
    //      }
    //      else {
    //        negative += numbers[i];
    //      }
    //      i++;
    //    }
    //    System.out.println("positive: " + positive);
    //    System.out.println("negative: " + negative);
    // --------------------------------------------실습 2--------------------------------
  }
}
