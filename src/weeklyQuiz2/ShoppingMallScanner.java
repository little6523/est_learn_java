package weeklyQuiz2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingMallScanner {

  // startNumber ~ endNumber 사이의 값만 입력받게 하는 기능
  public int selectNumber(int startNumber, int endNumber) throws InputMismatchException {
    Scanner sc = new Scanner(System.in);
    while (true) {
      try {
        int number = sc.nextInt();
        if (number < startNumber || number > endNumber) {
          throw new IncorrectInputSelectException(
              "잘못된 입력이에요. " + startNumber + " ~ " + endNumber + "번 기능을 선택해주세요.");
        }
        return number;
      } catch (InputMismatchException e) {
        System.out.println("숫자만 입력해주세요.");
        sc.nextLine();
      } catch (IncorrectInputSelectException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  // 생성할 제품 정보 입력 기능
  public Product createProduct(int selectProduct) throws InputMismatchException {
    Scanner sc = new Scanner(System.in);
    System.out.println("추가할 제품의 정보를 입력해주세요.");
    while (true) {
      try {
        System.out.print("상품명: ");
        String name = sc.nextLine();

        System.out.print("가격: ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("재고: ");
        int stock = sc.nextInt();
        sc.nextLine();

        if (selectProduct == 1) {
          System.out.print("사이즈[XS, S, M, L, XL, XXL]: ");
          String size = sc.nextLine();
          return new Clothing(name, price, stock, size);
        }
        if (selectProduct == 2) {
          System.out.print("브랜드: ");
          String brand = sc.nextLine();
          return new Electronics(name, price, stock, brand);
        }
        if (selectProduct == 3) {
          System.out.print("유통기한[yyyyMMdd]: ");
          String expirationDate = sc.nextLine();
          return new Food(name, price, stock, stringToLocalDate(expirationDate));
        }
      } catch (InputMismatchException e) {
        System.out.println("올바르지 않은 입력입니다.");
      }
    }
  }

  // 입력받은 날짜를 LocalDate 형태로 변환하는 기능
  private LocalDate stringToLocalDate(String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    return LocalDate.parse(date, formatter);
  }
}
