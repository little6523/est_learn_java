package weeklyQuiz2;

import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingMall {

  List<Product> productList = new ArrayList<>();

  // 상품 리스트 조회 기능
  void manipulateProductList() {
    System.out.println("현재 상품 리스트:");
    for (Product product : productList) {
      System.out.print(" " + product);
    }
  }

  // 상품 리스트에 상품 추가 기능
  void manipulateProductList(Product product) {
    productList.add(product);
    System.out.println(product.productName + "이(가) 상품 리스트에 추가 되었습니다.");
    this.manipulateProductList();
  }

  // 상품 리스트에 상품 삭제 기능
  void manipulateProductList(String productName) {
    for (Product product : productList) {
      if (product.productName.equals(productName)) {
        productList.remove(product);
        System.out.println(product.productName + "이(가) 상품 리스트에서 삭제 되었습니다.");
        this.manipulateProductList();
      }
    }
  }

  abstract boolean checkOrderAvailability(Product product);
}
