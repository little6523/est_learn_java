package weeklyQuiz2;

public class Product {

  private final String name; // 제품명
  private final int price; // 가격
  private int stock; // 재고량

  public Product(String name, int price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  // 가격 계산 메소드
  public double calculatePrice() {
    return price;
  }

  public int getStock() {
    return stock;
  }

  public int getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }
}
