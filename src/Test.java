import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Test {
  public static void main(String[] args) {
    String[] words = {"apple", "banana", "cherry", "durian"};
    for (int i = 0; i < words.length - 1; i++) {
      System.out.println(i);
      for (int j = i + 1; j < words.length; j++) {
        System.out.println(words[i] + " " + words[j]);
      }
    }
  }
}
