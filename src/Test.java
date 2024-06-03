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

    //    String str1 = "Hello";
    //    String str2 = "Hello";
    //    String str3 = new String("Hello");
    //
    //    System.out.println(str1 == str2); // true
    //    System.out.println(str1 == str3); // false
    // --------------------------------------------실습 4--------------------------------
    // --------------------------------------------실습 5--------------------------------
    //    System.out.println(true && true);
    //    System.out.println(true && false);
    //    System.out.println(false && true);
    //    System.out.println(false && false);
    //
    //    System.out.println(true || true);
    //    System.out.println(true || false);
    //    System.out.println(false || true);
    //    System.out.println(false || false);
    //
    //    System.out.println(true ^ true);
    //    System.out.println(true ^ false);
    //    System.out.println(false ^ true);
    //    System.out.println(false ^ false);
    // --------------------------------------------실습 5--------------------------------
    // i는 2의 배수이면서 3의 배수이다.
    // i % 2 == 0 && i % 3 == 0

    // x는 30의 배수이면서 2의 배수이거나 5의 배수이다.
    // (x % 30 == 0) && ((x % 2 == 0) || (x % 5 == 0))
    // --------------------------------------------실습 5--------------------------------
    // --------------------------------------------실습 6--------------------------------
    //    System.out.println(1 & 1);
    //    System.out.println(1 & 0);
    //    System.out.println(0 & 0);
    //
    //    System.out.println(1 ^ 1);
    //    System.out.println(1 ^ 0);
    //    System.out.println(0 ^ 0);
    //
    //    System.out.println(1 ^ ~1);
    //    System.out.println(1 ^ ~0);
    //    System.out.println(0 ^ ~0);
    // --------------------------------------------실습 6--------------------------------
    // --------------------------------------------실습 7--------------------------------
    //    int score = 95;
    //    char grade = (score > 90) ? 'A' : 'B';
    //
    //    String grade1 = "";
    //
    //    // score는 95점이고, 5의 배수이면 "good" 아니라면 "bad"
    //    grade1 = ((score > 90) && (score % 5 == 0)) ? "good" : "bad";
    //    System.out.println(grade1);
    //
    //    if (score > 90) {
    //      grade = 'A';
    //    } else {
    //      grade = 'B';
    //    }
    // --------------------------------------------실습 7--------------------------------
    // --------------------------------------------실습 8--------------------------------
    //    int number = 10;
    //
    //    if (number > 10) {
    //      System.out.println("number는 10보다 큽니다");
    //    } else if (number < 10) {
    //      System.out.println("number는 10보다 작습니다.");
    //      if (number > 5) {
    //        System.out.println("number는 5보다 큽니다.");
    //      }
    //    } else {
    //      System.out.println("number는 10입니다.");
    //    }
    //
    //    int a = 5;
    //    int b = 3;
    //
    //    if (a > b) {
    //      System.out.println("a is greater than b");
    //    } else if (a == b) {
    //      System.out.println("a and b are equal");
    //    } else {
    //      System.out.println("a is less than b");
    //    }
    //
    //    String res =
    //        (a > b) ? "a is greater than b" : (a == b) ? "a and b are equal" : "a is less than b";
    // --------------------------------------------실습 8--------------------------------
    // --------------------------------------------실습 9--------------------------------
    //    int x = 10;
    //    if (x > 0) {
    //      System.out.println("x는 양수입니다.(if)");
    //    } else if (x < 0) {
    //      System.out.println("x는 음수입니다.");
    //    } else {
    //      System.out.println("x는 0입니다.");
    //    }
    //    //
    // ###########################################################################################
    //    String res1 = (x > 0) ? "x는 양수입니다.(삼항)" : ((x < 0) ? "x는 음수입니다." : "x는 0입니다.");
    //    System.out.println(res1);
    //
    //    int score = 75;
    //    if (score >= 90) {
    //      System.out.println("A");
    //    } else if (score >= 80 && score < 90) {
    //      System.out.println("B");
    //    } else if (score >= 70 && score < 80) {
    //      System.out.println("C");
    //    } else if (score >= 60 && score < 70) {
    //      System.out.println("D");
    //    } else {
    //      System.out.println("F");
    //    }
    //
    //    //
    // ###########################################################################################
    //
    //    int year = 2023;
    //    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
    //      System.out.println("윤년입니다.");
    //    } else {
    //      System.out.println("윤년이 아닙니다.");
    //    }
    //
    //    //
    // ###########################################################################################
    //
    //    int a = 10;
    //    int b = 20;
    //    int c = 30;
    //
    //    int max = 0;
    //    if (a > b) {
    //      if (a > c) {
    //        max = a;
    //      } else {
    //        max = c;
    //      }
    //    } else {
    //      if (b > c) {
    //        max = b;
    //      } else {
    //        max = c;
    //      }
    //    }
    //    System.out.println(max);
    //
    //    //
    // ###########################################################################################
    //
    //    int passScore = 60;
    //    int myScore = 75;
    //    if (myScore >= passScore) {
    //      System.out.println("합격입니다.(if)");
    //    } else {
    //      System.out.println("불합격입니다.(if)");
    //    }
    //    String res2 = (myScore >= passScore) ? "합격입니다.(삼항)" : "불합격입니다.(삼항)";

    // --------------------------------------------실습 9--------------------------------
    // --------------------------------------------실습 10--------------------------------
    //    int a = 10;
    //    int b = 5;
    //
    //    boolean result1 = (a > 5) && (b < 10);
    //    boolean result2 = (a > 5) || (b > 10);
    //    boolean result3 = !(a > 5);
    //
    //    int three = 3;
    //    int five = 5;
    //    int two = 2;
    //
    //    boolean result = (five > three) || (five < two) && (five < three);
    //    System.out.println(result);
    // --------------------------------------------실습 10--------------------------------
    // --------------------------------------------실습 11--------------------------------
    //    boolean x = true;
    //    boolean y = false;
    //    boolean z = true;
    //    if (x && !y) {
    //      System.out.println("조건 1 충족");
    //    }
    //    if((y && z) || (!x && !z)){
    //      System.out.println("조건 2 충족");
    //    }
    //    if (x || y || z) {
    //      System.out.println("적어도 하나는 참");
    //    }
    //    if (!x && !y && !z) {
    //      System.out.println("모두 거짓");
    //    }
    // --------------------------------------------실습 11--------------------------------

    //    int data = 10;
    //
    //    switch (data) {
    //      case 1:
    //        System.out.println("1입니다.");
    //        break;
    //      case 2:
    //        System.out.println("2입니다.");
    //        break;
    //      case 10:
    //        System.out.println("10입니다.");
    //        break;
    //      default:
    //        System.out.println("dfdf");
    //    }

    String day = "수요일";

    switch (day) {
      case "월요일":
        System.out.println("책 읽기");
        break;
      case "화요일":
        System.out.println("산책 하기");
        break;
      case "수요일":
        System.out.println("코딩 하기");
        break;
      case "목요일":
        System.out.println("노래 듣기");
        break;
      case "금요일":
        System.out.println("운동 하기");
        break;
      case "토요일":
        System.out.println("영화 보기");
        break;
      case "일요일":
        System.out.println("여행 가기");
        break;
      default:
        System.out.println("알 수 없는 요일");
    }

    char grade = 'A';

    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
    }

    char op = '+';
    int num1 = 10;
    int num2 = 20;

    switch (op) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
    }

    String color = "red";

    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
    }

    int score = 89;

    switch (score/10) {
      case 10:
        System.out.println('A');
      case 9:
        System.out.println('A');
        break;
      case 8:
        System.out.println('B');
        break;
      case 7:
        System.out.println('C');
        break;
      case 6:
        System.out.println('D');
        break;
      default:
        System.out.println('F');
    }

    String language = "Python";

    switch (language) {
      case "Java":
        System.out.println("자바에요");
        break;
      case "Python":
        System.out.println("파이썬이에요");
        break;
      case "C++":
        System.out.println("C++이에요");
        break;
      case "JavaScript":
        System.out.println("자바스크립트에요");
        break;
    }
  }
}
