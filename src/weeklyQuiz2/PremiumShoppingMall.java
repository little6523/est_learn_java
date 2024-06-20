package weeklyQuiz2;

public class PremiumShoppingMall extends ShoppingMall {

  public PremiumShoppingMall(int size) {
    super(size);
  }

  // 주문 가능 여부 확인 메소드
  @Override
  public boolean checkOrderAvailability() {
    Product[] products = getProductList();
    for (int i = 0; i < getNumberOfProducts(); i++) {
      if (products[i].getStock() < 10) return false;
    }
    return true;
  }
}
