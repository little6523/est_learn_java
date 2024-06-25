import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {

  private Stack<Book<T>> books; // Book 객체들을 저장하는 Stack

  // 기본 생성자
  public BookStack() {
    this.books = new Stack<>();
  }

  // 매개변수로 전달받은 도서를 Stack의 맨 위에 추가
  public void pushBook(Book<T> book) {
    books.push(book);
  }

  // Stack의 맨 위에 있는 도서를 제거하고 반환
  public Book<T> popBook() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return books.pop();
  }

  // Stack의 맨 위에 있는 도서를 반환하지만 제거하지는 않음
  public Book<T> peekBook() {

    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return books.peek();
  }

  // Stack이 비어있는지 여부를 반환
  public boolean isEmpty() {
    return books.size() == 0;
  }
}
