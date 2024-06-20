package weeklyQuiz2;

import java.io.UnsupportedEncodingException;

public class Electronics extends Product {

  // Apple의 경우 가격의 1.2배 (20%추가)
  private final double priceOfApple = 1.2;

  private String brand; // 브랜드

  public Electronics(String name, int price, int stock, String brand) {
    super(name, price, stock);
    this.brand = brand;
  }

  private boolean checkBrand(String brand) {
    return this.brand.equals(brand);
  }

  @Override
  public double calculatePrice() {
    double price = getPrice();
    if (checkBrand("Apple")) {
      return price * priceOfApple;
    }
    return price;
  }

  public void print() {
    int name_len, price_len, stock_len, size_len;
    try {
      name_len = getPrintfStrLength(20, "제품명: " + getName());
      price_len = getPrintfStrLength(15, "가격: " + getPrice() + "원");
      stock_len = getPrintfStrLength(15, "재고: " + getStock());
      size_len = getPrintfStrLength(15, "브랜드: " + brand);
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    String formatStr =
            "|%-" + name_len + "s|%-" + price_len + "s|%-" + stock_len + "s|%-" + size_len + "s|\n";
    System.out.printf(formatStr, "제품명: " + getName(), "가격: " + getPrice() + "원", "재고: " + getStock(), "브랜드: " + brand);
  }
}
