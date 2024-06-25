import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {

  private List<Book<T>> books; // Book 객체들을 저장하는 ArrayList

  // 기본 생성자
  public BookShelf() {
    this.books = new ArrayList<>();
  }

  // 매개변수로 전달받은 도서를 books에 추가
  @Override
  public void addBook(Book<T> book) {
    boolean isPossible = true;
    for (Book<T> b : books) {
      if (b.getIdentifier().equals(book.getIdentifier())) {
        System.out.println("해당 식별자로 책을 추가할 수 없습니다.");
        isPossible = false;
        break;
      }
    }
    if (isPossible) {
      books.add(book);
      System.out.println("책이 추가되었습니다.");
    }
  }

  // 매개변수로 전달받은 도서를 books에서 삭제
  @Override
  public void removeBook(Book<T> book) {
    for (int i = 0; i < books.size(); i++) {
      Book<T> myBook = books.get(i);
      if (myBook.getTitle().equals(book.getTitle())
      && myBook.getAuthor().equals(book.getAuthor())
      && myBook.getIdentifier().equals(book.getIdentifier())) {
        books.remove(i);
        break;
      }
    }
  }

  // 도서 제목으로 검색하는 메소드
  @Override
  public List<Book<T>> searchByTitle(String title) {

    List<Book<T>> searchedBooksByTitle = new ArrayList<>();

    for (Book<T> book : books) {
      if (book.getTitle().toUpperCase().contains(title.toUpperCase())) {
        searchedBooksByTitle.add(book);
      }
    }

    return searchedBooksByTitle;
  }

  // 도서 저자로 검색하는 메소드
  @Override
  public List<Book<T>> searchByAuthor(String author) {

    List<Book<T>> searchedBooksByAuthor = new ArrayList<>();

    for (Book<T> book : books) {
      if (book.getAuthor().toUpperCase().contains(author.toUpperCase())) {
        searchedBooksByAuthor.add(book);
      }
    }

    return searchedBooksByAuthor;
  }
}
