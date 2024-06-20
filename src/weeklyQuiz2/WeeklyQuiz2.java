package weeklyQuiz2;

import java.time.LocalDate;

public class WeeklyQuiz2 {

  static final int INITIAL_PRODUCT_LIST_SIZE = 5;

  public static void main(String[] args) {
    PremiumShoppingMall premiumShoppingMall = new PremiumShoppingMall(INITIAL_PRODUCT_LIST_SIZE);

    System.out.println("프리미엄 쇼핑몰에 오신 것을 환영합니다!!");
    System.out.println("----- 현재 제품 리스트의 최대 용량: " + premiumShoppingMall.getSize() + " -----");
    Clothing clothing1 = new Clothing("shirts", 10000, 20, "XXL");
    Clothing clothing2 = new Clothing("pants", 30000, 11, "M");
    Clothing clothing3 = new Clothing("hat", 15000, 8, "L");

    Electronics electronics1 = new Electronics("iPhone", 1500000, 14, "Apple");
    Electronics electronics2 = new Electronics("G2", 800000, 2, "LG");
    Electronics electronics3 = new Electronics("Galaxy", 1200000, 10, "Samsung");

    Food food1 = new Food("김밥", 5000, 15, LocalDate.of(2024, 6, 21));
    Food food2 = new Food("떢볶이", 6000, 30, LocalDate.of(2024, 6, 29));
    Food food3 = new Food("라면", 5500, 40, LocalDate.of(2024, 6, 27));

    premiumShoppingMall.addProduct(clothing1);
    premiumShoppingMall.addProduct(clothing2);
    premiumShoppingMall.addProduct(clothing3);
    premiumShoppingMall.addProduct(electronics1);
    premiumShoppingMall.addProduct(electronics2); // <- 바구니 최대 사이즈 도달

    premiumShoppingMall.addProduct(electronics3); // <- 바구니 사이즈 증가
    premiumShoppingMall.addProduct(food1);
    premiumShoppingMall.addProduct(food2);
    premiumShoppingMall.addProduct(food3);

    premiumShoppingMall.displayProducts();

    premiumShoppingMall.removeProduct(clothing1);
    premiumShoppingMall.removeProduct("iPhone");

    premiumShoppingMall.displayProducts();

    premiumShoppingMall.removeProduct(clothing3);
    premiumShoppingMall.removeProduct("G2");

    premiumShoppingMall.displayProducts();
  }
}
