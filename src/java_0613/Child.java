package java_0613;// 자식(child) 클래스를 구현하고 부모 클래스를 상속 받아 투자한다라는 메서드를 가지고 있는데 해당 메서드는 money를 1000원을 뺴는 로직을 갖고있다.

public class Child extends Parent {

  public void invest() {
    if(this.money < 1000) {
      this.money = 0;
    } else {
      this.money -= 1000;
      System.out.println("1000원을 투자하였습니다. 현재 금액: " + this.money);
    }
  }
}