package weeklyQuiz2;

import java.time.LocalDate;
import java.time.Period;

public class Food extends Product {

    private final double discountOfDays = 7;

    // 유통기한이 7일 이하로 남은 경우 가격의 1.2배 (20%추가)
    private final double priceOfSevenDaysOrLess = 0.8;

    private final LocalDate expirationDate;

    public Food(String name, int price, int stock, LocalDate expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculatePrice() {
        int price = getPrice();

        // 두 날짜 사이의 기간을 계산
        LocalDate today = LocalDate.now();
        Period remainedTime = Period.between(today, expirationDate);
        if (remainedTime.getDays() <= discountOfDays) {
            return price * priceOfSevenDaysOrLess;
        }
        return price;
    }
}
