// 부모 (parent) 클래스를 구현하고 money 멤버변수 를 가지고 있고 저축한다 라는 메서드를 가지고있는데 해당 메서드는  money 를 10000원씩 추가하는
// 로직을 갖고있다

public class Parent {

  int money = 0;

  public void saveMoney() {
    this.money += 10000;
    System.out.println("10000원이 저축 되었습니다. 현재 금액: " + this.money);
  }
}
