package weeklyQuiz2;

import java.io.UnsupportedEncodingException;

public class Product {

  private String name; // 제품명
  private double price; // 가격
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

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public static int getPrintfStrLength(int formatSize, String str) throws UnsupportedEncodingException {
    return formatSize - (getByteLength(str) - str.length());
  }

  public static int getByteLength(String str) throws UnsupportedEncodingException {
    return str.getBytes("euc-kr").length;
  }

  public void print() {}
}
