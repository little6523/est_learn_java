package weeklyQuiz2;

public class PremiumShoppingMall extends ShoppingMall {

    // 주문 가능 여부 확인 메소드
    @Override
    boolean checkOrderAvailability(Product product) {
        return product.productQuantity >= 10;
    }
}
