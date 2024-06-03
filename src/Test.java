import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    // --------------------------------------------실습 1--------------------------------
    //    int number1 = 10;
    //    int number2 = 3;
    //
    //    int sum = number1 + number2;
    //    int diff1 = number2 - number1;
    //    int diff2 = number1 - number2;
    //
    //    int product = number1 * number2;
    //    int quot = number1 / number2;
    //    int remainder = number1 % number2;
    //
    //    System.out.println("덧셈 " + sum);
    //    System.out.println("뺄셈1 " + diff1);
    //    System.out.println("뺄셈2 " + diff2);
    //    System.out.println("곱셈 " + product);
    //    System.out.println("나눗셈 " + quot);
    //    System.out.println("나머지 " + remainder);
    // --------------------------------------------실습 1--------------------------------
    // --------------------------------------------실습 2--------------------------------
    //    byte a = 10;
    //    byte b = 4;
    //    int c = a / b;
    //    double d = a / b;
    //
    //    char c1 = 'A' + 1; // B
    //    char c2 = 'A';
    //    // char c3 = c2 + 1; // error
    //
    //    String str1 = "안녕하세요";
    //    String str2 = "만나서 반갑습니다.";
    //    String str3 = str1 + str2;

    // --------------------------------------------실습 2--------------------------------
    // --------------------------------------------실습 3--------------------------------
    // 문자열 "Hello"와 123이 먼저 연산되어 "Hello123"이 되고,
    // 이것을 다시 456과 연산하여 "Hello123456"이 됩니다.
    //    System.out.println("Hello" + 123 + 456); // Hello123456
    //
    //    // 숫자 123과 456이 먼저 연산되어 579가 되고,
    //    // 이것을 문자열 "Hello"와 연산하여 "579Hello"가 됩니다.
    //    System.out.println(123 + 456 + "Hello"); // 579Hello
    //
    //    StringBuilder sb = new StringBuilder();
    //    sb.append(123);
    //    sb.append(456);
    //    sb.append("Hello");
    //    System.out.println(sb);
    // --------------------------------------------실습 3--------------------------------
    //    int number1 = 10;
    //    int number2 = 30;
    //
    //    System.out.println(number1 > number2);
    //    System.out.println(number1 >= number2);
    //    System.out.println(number1 <= number2);
    //    System.out.println(number1 < number2);
    //
    //    System.out.println(number2 == number1);
    //    System.out.println(number2 != number2);
    //
    //    String a = new String();
    //    String b = new String();
    //    System.out.println(a == b);
    //    System.out.println(a.equals(b));
    //
    //    System.out.println('A' < 'B');
    // --------------------------------------------실습 3--------------------------------
    // --------------------------------------------실습 4--------------------------------

    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");

    System.out.println(str1 == str2); // true
    System.out.println(str1 == str3); // false
    // --------------------------------------------실습 4--------------------------------
  }
}
