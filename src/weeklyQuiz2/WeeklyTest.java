//package weeklyQuiz2;
//
//public class WeeklyTest {
//    public void test() {
//        ShoppingMallScanner smScanner = new ShoppingMallScanner();
//        int selectFunction, selectProduct, selectRemove;
//
//        System.out.println("프리미엄 쇼핑몰에 오신 것을 환영합니다!!");
//        while (true) {
//            selectProduct = 0;
//            selectRemove = 0;
//
//            System.out.println("이용하실 기능을 선택하세요. [1. 제품 추가 | 2. 제품 목록 출력 | 3. 제품 삭제 | 4. 종료]");
//            selectFunction = smScanner.selectNumber(1, 4);
//
//            // 4. 프로그램 종료
//            if (selectFunction == 4) {
//                System.out.println("쇼핑몰 프로그램을 종료합니다.");
//                break;
//            }
//
//            // 1. 제품 추가
//            if (selectFunction == 1) {
//                System.out.println("제품 종류 [1. 의류 | 2. 전자제품 | 3.식품 | 4. 취소]");
//                selectProduct = smScanner.selectNumber(1, 4);
//            }
//
//            // 1-4. 취소
//            if (selectProduct == 4) {
//                continue;
//            }
//
//            // 1-1. 의류, 1-2. 전자제품, 1-3. 식품
//            if (selectProduct == 1 || selectProduct == 2 || selectProduct == 3) {
//                premiumShoppingMall.addProduct(smScanner.inputProductInfo(selectProduct));
//            }
//
//            // 2. 제품 리스트 출력
//            if (selectFunction == 2) {
//                premiumShoppingMall.displayProducts();
//
//                selectFunction = 0;
//            }
//
//            // 3. 제품 삭제
//            if (selectFunction == 3) {
//
//                if (premiumShoppingMall.isEmpty()) {
//                    continue;
//                }
//                premiumShoppingMall.displayProducts();
//
//                System.out.println("삭제할 기준 [1. 제품 / 2. 제품명 / 3. 취소]");
//                selectRemove = smScanner.selectNumber(1, 3);
//            }
//
//            // 3-3. 취소
//            if (selectRemove == 3) {
//                continue;
//            }
//
//            // 3-1. 제품 기준 삭제
//            if (selectRemove == 1) {
//                System.out.println("제품 종류 [1. 의류 | 2. 전자제품 | 3.식품]");
//                selectProduct = smScanner.selectNumber(1, 3);
//                Product product = smScanner.inputProductInfo(selectProduct);
//                premiumShoppingMall.removeProduct(product);
//            }
//
//            // 3-2. 제품명 기준 삭제
//            if (selectRemove == 2) {
//                System.out.print("삭제할 제품명: ");
//                String name = smScanner.inputString();
//                premiumShoppingMall.removeProduct(name);
//            }
//        }
//    }
//
//}
