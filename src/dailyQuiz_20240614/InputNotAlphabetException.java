package dailyQuiz_20240614;

public class InputNotAlphabetException extends Exception {
    public InputNotAlphabetException() {
        super("입력하신 문자열 중에 알파벳이 아닌 것이 존재합니다.");
    }
}
