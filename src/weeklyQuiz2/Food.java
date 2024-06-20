package weeklyQuiz2;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.Period;

public class Food extends Product {

  private final double remainingDays = 7;

  // 유통기한이 7일 이하로 남은 경우 가격의 1.2배 (20%추가)
  private final double priceOfRemainingDaysOrLess = 0.8;

  private final LocalDate expirationDate;

  public Food(String name, int price, int stock, LocalDate expirationDate) {
    super(name, price, stock);
    this.expirationDate = expirationDate;
  }

  @Override
  public double calculatePrice() {
    double price = getPrice();

    // 두 날짜 사이의 기간을 계산
    LocalDate today = LocalDate.now();
    Period remainedTime = Period.between(today, expirationDate);
    if (remainedTime.getDays() <= remainingDays) {
      return price * priceOfRemainingDaysOrLess;
    }
    return price;
  }

  public void print() {
    int name_len, price_len, stock_len, size_len;
    try {
      name_len = getPrintfStrLength(20, "제품명: " + getName());
      price_len = getPrintfStrLength(15, "가격: " + getPrice() + "원");
      stock_len = getPrintfStrLength(15, "재고: " + getStock());
      size_len = getPrintfStrLength(15, "유통기한: " + expirationDate);
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    String formatStr =
            "|%-" + name_len + "s|%-" + price_len + "s|%-" + stock_len + "s|%-" + size_len + "s|\n";
    System.out.printf(formatStr, "제품명: " + getName(), "가격: " + getPrice() + "원", "재고: " + getStock(), "유통기한: " + expirationDate);
  }
}
