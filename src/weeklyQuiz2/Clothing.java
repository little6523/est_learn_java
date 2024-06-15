package weeklyQuiz2;

public class Clothing extends Product {

  // 사이즈 종류
  private static final String[] sizes = {"XS", "S", "M", "L", "XL", "XXL"};

  // L이상의 사이즈
  private final double priceOfSizeLOrMore = 1.1;

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

  private boolean checkLargerThanSizeL(String size) {
    int inputSize = findSizeAtSizes(size);
    int sizeL = findSizeAtSizes("L");
    return inputSize > sizeL;
  }

  @Override
  public double calculatePrice() {
    int price = getPrice();
    if (checkLargerThanSizeL(size)) {
      return price * this.priceOfSizeLOrMore;
    }
    return price;
  }
}
