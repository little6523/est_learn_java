package weeklyQuiz2;

public class Electronics extends Product {

    // Apple의 경우 가격의 1.2배 (20%추가)
    final double surchargeApplePrice = 1.2;

    String brand; // 브랜드

    public Electronics(String productName, int productPrice, int productQuantity, String brand) {
        super(productName, productPrice, productQuantity);
        this.brand = brand;
    }

    double calculatePrice() {
        if (this.brand.equals("Apple")) {
            return this.productPrice * surchargeApplePrice;
        }
        return this.productPrice;
    }
}