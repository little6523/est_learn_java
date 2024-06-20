package weeklyQuiz2;

public abstract class ShoppingMall {

  private Product[] productList; // 제품 배열
  private int size; // 제품 배열의 크기
  private int numberOfProducts;

  public ShoppingMall(int size) {
    this.size = size;
    this.productList = new Product[size];
    numberOfProducts = 0;
  }

  public Product[] getProductList() {
    return productList;
  }

  public int getSize() {
    return size;
  }

  public int getNumberOfProducts() {
    return numberOfProducts;
  }

  // 제품 추가 기능
  void addProduct(Product product) {
    if (numberOfProducts == size) {
      sizeUpProductList();
    }
    productList[numberOfProducts] = product;
    numberOfProducts++;
    System.out.println(product.getName() + " 상품이 추가되었습니다.");
  }

  // 제품 삭제 기능
  void removeProduct(Product product) {
    int idx = -1;
    for (int i = 0; i < numberOfProducts + 1; i++) {
      if (productList[i].equals(product)) {
        idx = i;
        break;
      }
    }

    remove(idx, product.getName());
    numberOfProducts--;
  }

  void removeProduct(String name) {
    int idx = -1;
    for (int i = 0; i < numberOfProducts; i++) {
      if (productList[i].getName().equals(name)) {
        idx = i;
        break;
      }
    }
    remove(idx, name);
    numberOfProducts--;
  }

  void remove(int idx, String name) {
    if (idx == -1) {
      System.out.println("입력하신 정보의 제품이 존재하지 않습니다.");
      return;
    }

    for (int i = idx; i < numberOfProducts - 1; i++) {
      productList[i] = productList[i + 1];
    }
    productList[numberOfProducts - 1] = null;
    System.out.println(name + " 제품을 삭제 합니다.");
  }

  // 제품 출력 기능
  void displayProducts() {
    if (isEmpty()) {
      System.out.println("제품 리스트가 비었습니다.");
      return;
    }
    System.out.println("------------ [↓제품 리스트↓] ------------");
    System.out.println("현재 제품 리스트의 최대 용량: " + size);
    System.out.println("주문 가능 여부: " + checkOrderAvailability());
    for (int i = 0; i < numberOfProducts; i++) {
      productList[i].print();
    }

    System.out.println("------------ [↑제품 리스트↑] ------------");
  }

  // 제품 리스트가 꽉 찼다면 2배 크기로 늘리는 기능
  private void sizeUpProductList() {

    System.out.println("----- 바구니가 꽉차서 바구니 크기를 늘립니다. -----");
    this.size *= 2;
    Product[] productList = new Product[this.size];

    System.arraycopy(this.productList, 0, productList, 0, numberOfProducts);

    System.out.println("----- 현재 제품 리스트의 최대 용량: " + size + " -----");

    this.productList = productList;
  }

  // 제품 리스트가 비어있는지 확인
  public boolean isEmpty() {
    return numberOfProducts == 0;
  }

  public abstract boolean checkOrderAvailability();
}
