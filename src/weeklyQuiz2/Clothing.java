package weeklyQuiz2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clothing extends Product{

    // 사이즈 종류
    final List<String> sizes =
            new ArrayList<>(Arrays.asList("XS", "S", "M", "L", "XL", "XXL"));
    final double priceLargerThanSizeOfL = 1.1;

    String size; // 사이즈

    public Clothing(String productName, int productPrice, int productQuantity, String size) {
        super(productName, productPrice, productQuantity);
        this.size = size;
    }

    double calculatePrice() {
        if (this.sizes.indexOf(this.size) >= this.sizes.indexOf("L")) {
            return this.productPrice * this.priceLargerThanSizeOfL;
        }
        return this.productPrice;
    }
}
