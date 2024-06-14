package weeklyQuiz2;

import java.time.LocalDate;
import java.time.Period;

public class Food extends Product {

    final double discountOfDay = 7;

    // 유통기한이 7일 이하로 남은 경우 가격의 1.2배 (20%추가)
    final double priceLessThanSevenDays = 0.8;

    LocalDate expirationDate;
    LocalDate today = LocalDate.now();

    public Food(String productName, int productPrice, int productQuantity, LocalDate expirationDate) {
        super(productName, productPrice, productQuantity);
        this.expirationDate = expirationDate;
    }

    double calculatePrice() {
        // 두 날짜 사이의 기간을 계산
        Period remainedTime = Period.between(this.today, this.expirationDate);
        if (remainedTime.getDays() <= discountOfDay) {
            return productPrice * priceLessThanSevenDays;
        }
        return productPrice;
    }
}
