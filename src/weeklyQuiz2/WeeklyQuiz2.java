package weeklyQuiz2;

public class WeeklyQuiz2 {

  static final int INITIAL_PRODUCT_LIST_SIZE = 10;

  public static void main(String[] args) {
    PremiumShoppingMall premiumShoppingMall =
            new PremiumShoppingMall(INITIAL_PRODUCT_LIST_SIZE);

    ShoppingMallScanner smScanner = new ShoppingMallScanner();
    int selectFunction, selectProduct;

    System.out.println("프리미엄 쇼핑몰에 오신 것을 환영합니다!!");
    while (true) {
      System.out.println("이용하실 기능을 선택하세요. [1. 제품 추가 | 2. 제품 목록 출력 | 3. 제품 삭제 | 4. 종료]");
      selectFunction = smScanner.selectNumber(1, 4);
      if (selectFunction == 4) {
        System.out.println("쇼핑몰 프로그램을 종료합니다.");
        break;
      }
      if (selectFunction == 1) {
        System.out.println("제품 종류 [1. 의류 | 2. 전자제품 | 3.식품 | 4. 취소]");
        selectProduct = smScanner.selectNumber(1, 4);

        if (selectProduct == 4) {
          continue;
        }
        premiumShoppingMall.manageProductList(
                smScanner.createProduct(selectProduct));
      }

      if (selectFunction == 2) {
        premiumShoppingMall.manageProductList();
      }

      if (selectFunction == 3) {
        premiumShoppingMall.manageProductList();
        if (premiumShoppingMall.getNumberOfProducts() == 0) {
          continue;
        }
        System.out.print("삭제할 제품 번호: ");
        int deleteIdx = smScanner.selectNumber(1, premiumShoppingMall.getNumberOfProducts());
        premiumShoppingMall.manageProductList(deleteIdx);
      }
    }
  }
}
