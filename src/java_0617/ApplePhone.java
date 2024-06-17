package java_0617;

public class ApplePhone implements Phone{
    @Override
    public String call() {
        return "애플폰이 전화를 겁니다.";
    }

    @Override
    public String answerThePhone() {
        return "애플폰이 전화를 받습니다.";
    }
}
