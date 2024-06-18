import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
  public static void main(String[] args) {
    // ----------------- 2교시 ---------------------------
    //    System.out.println(compare(1, 2));

    // 메서드 이름은 compareStirng t1,t2 매개변수 반환값 void 타입 파라미터 한정자가 String
    // 내부 로직은 문자열이 같으면 okay 출력 틀리면 no 출력
    compareString("hello", "hello");
    compareString("hello", "hello1");
    // ----------------- 2교시 ---------------------------
  }

  public static <T extends Number> int compare(T t1, T t2) {
    //    double v1 = t1.doubleValue();
    //    double v2 = t1.doubleValue();
    double v1 = (double) t1;
    double v2 = (double) t2;
    return Double.compare(v1, v2);
  }

  public static <T extends String> void compareString(String t1, String t2) {
    //    if (t1.equals(t2)) {
    //      System.out.println("okay");
    //      return;
    //    }
    //    System.out.println("no");

    System.out.println(t1.equals(t2) ? "okay" : "no");
  }
}
