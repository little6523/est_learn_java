package weeklyQuiz2;

public class Electronics extends Product {

    // Apple의 경우 가격의 1.2배 (20%추가)
    private final double priceOfApple = 1.2;

    private String brand; // 브랜드

    public Electronics(String name, int price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    private boolean checkBrand(String brand) {
        return this.brand.equals("Apple");
    }

    @Override
    public double calculatePrice() {
        int price = getPrice();
        if (checkBrand(brand)) {
            return price * priceOfApple;
        }
        return price;
    }
}