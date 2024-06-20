package weeklyQuiz2;

import java.io.UnsupportedEncodingException;

public class Clothing extends Product {

  // 사이즈 종류
  private static final String[] sizes = {"XS", "S", "M", "L", "XL", "XXL"};

  // L이상의 사이즈
  private final double priceOfComparativeSizeOrMore = 1.1;

  private String size; // 사이즈

  public static String[] getSizes() {
    return sizes;
  }

  public Clothing(String name, int price, int stock, String size) {
    super(name, price, stock);
    this.size = size;
  }

  private int findSizeAtSizes(String size) {
    for (int i = 0; i < sizes.length; i++) {
      if (sizes[i].equals(size)) {
        return i;
      }
    }
    return -1;
  }

  private boolean checkLargerThanSize(String size) {
    int thisSizeIdx = findSizeAtSizes(this.size);
    int sizeIdx = findSizeAtSizes(size);
    return thisSizeIdx > sizeIdx;
  }

  @Override
  public double calculatePrice() {
    double price = getPrice();
    if (checkLargerThanSize("L")) {
      return price * priceOfComparativeSizeOrMore;
    }
    return price;
  }

  public void print() {
    int name_len, price_len, stock_len, size_len;
    try {
      name_len = getPrintfStrLength(20, "제품명: " + getName());
      price_len = getPrintfStrLength(15, "가격: " + getPrice() + "원");
      stock_len = getPrintfStrLength(15, "재고: " + getStock());
      size_len = getPrintfStrLength(15, "사이즈: " + size);
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    String formatStr =
           "|%-" + name_len + "s|%-" + price_len + "s|%-" + stock_len + "s|%-" + size_len + "s|\n";
    System.out.printf(formatStr, "제품명: " + getName(), "가격: " + getPrice() + "원", "재고: " + getStock(), "사이즈: " + size);
  }
}
