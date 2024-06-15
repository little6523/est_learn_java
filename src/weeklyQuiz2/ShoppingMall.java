package weeklyQuiz2;

public abstract class ShoppingMall {

  private Product[] productList;
  private int numberOfProducts;
  private int size;

  public int getNumberOfProducts() {
    return numberOfProducts;
  }

  public ShoppingMall(int size) {
    this.size = size;
    this.productList = new Product[size];
    numberOfProducts = 0;
  }

  // 제품 리스트가 꽉 찼다면 2배 크기로 늘리는 기능
  private void sizeUpProductList() {

    System.out.println("바구니가 꽉차서 바구니 개수를 늘립니다.");
    this.size *= 2;
    Product[] productList = new Product[this.size];

    if (numberOfProducts >= 0) {
      System.arraycopy(this.productList, 0, productList, 0, numberOfProducts);
    }

    this.productList = productList;
  }

  // 같은 제픔이 이미 제품 리스트에 담겼는지 확인하는 기능
  private boolean isContainedInProductList(Product product) {
    for (int i = 0; i < numberOfProducts; i++) {
      if (productList[i].equals(product)) {
        return true;
      }
    }
    return false;
  }

  // 제품 추가 기능
  void manageProductList(Product product) {
    if (numberOfProducts == productList.length) {
      sizeUpProductList();
    }

    if (!isContainedInProductList(product)) {
      productList[numberOfProducts] = product;
      numberOfProducts++;
    }
    System.out.println(product.getName() + " 상품이 추가되었습니다.");
  }

  // 제품 출력 기능
  void manageProductList() {
    if (numberOfProducts == 0) {
      System.out.println("제품 리스트가 비었습니다.");
      return;
    }
    System.out.println("------------ [제품 리스트] ------------");
    for (int i = 0; i < numberOfProducts; i++) {
      System.out.println(
          (i + 1) + ". "
              + productList[i].getName()
              + "     "
              + productList[i].calculatePrice()
              + "원(1EA 기준)    "
              + "재고: "
              + productList[i].getStock()
              + "개    "
              + "주문 가능 여부: "
              + checkOrderAvailability(productList[i]));
    }
  }

  // 제품 삭제 기능
  void manageProductList(int removeIdx) {
    String productName = productList[removeIdx - 1].getName();
    for (int i = removeIdx - 1; i < numberOfProducts; i++) {
      productList[i] = productList[i + 1];
    }
    numberOfProducts--;
    System.out.println(removeIdx + ". " + productName + " 상품을 삭제합니다.");
  }

  public abstract boolean checkOrderAvailability(Product product);
}
