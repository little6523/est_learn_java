import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class BookMain {
  public static void main(String[] args) {

    // BookShelf, BookStack 객체 생성
    BookShelf<String> bookShelf = new BookShelf<>();
    BookStack<Integer> bookStack = new BookStack<>();
    Scanner scanner = new Scanner(System.in);

    int selectFunction;
    boolean isStop = false;
    String title, author, identifier;
    while (!isStop) {
      try {
        System.out.println(
            "원하시는 기능을 선택하세요! "
                + "[1. 책 추가 | 2. 책 검색(제목) | 3. 책 검색(저자) | 4. 책 스택 peek() "
                + "| 5. 책 스택 pop() | 6. 책 스택 비었는지 검사 | 7. 책 삭제 | 8. 종료]");
        selectFunction = scanner.nextInt();
        scanner.nextLine();
        switch (selectFunction) {
          case 1:
            // 사용자로부터 도서 정보 입력
            System.out.print("제목: ");
            title = scanner.nextLine();

            System.out.print("저자: ");
            author = scanner.nextLine();

            System.out.print("식별자: ");
            identifier = scanner.nextLine();

            // 입력받은 도서 정보를 이용하여 Book 객체 생성 및 추가
            Book<String> bookOfBookShelf = new Book<>(title, author, identifier);
            Book<Integer> bookOfBookStack = new Book<>(title, author, Integer.parseInt(identifier));
            bookShelf.addBook(bookOfBookShelf);
            bookStack.pushBook(bookOfBookStack);

            break;

          case 2:
            // BookShelf에서 도서 제목으로 검색을 수행하고, 검색 결과를 출력
            System.out.print("검색할 책의 제목: ");
            title = scanner.nextLine();
            List<Book<String>> booksSearchedByTitle = bookShelf.searchByTitle(title);
            System.out.println("제목으로 검색을 수행한 결과입니다.");
            booksSearchedByTitle.forEach(book -> book.printInfo());
            System.out.println();

            break;

          case 3:
            // BookShelf에서 도서 저자로 검색을 수행하고, 검색 결과를 출력
            System.out.print("검색할 책의 저자: ");
            author = scanner.nextLine();
            List<Book<String>> booksAuthorByTitle = bookShelf.searchByAuthor(author);
            System.out.println("저자로 검색을 수행한 결과입니다.");
            booksAuthorByTitle.forEach(book -> book.printInfo());
            System.out.println();

            break;

          case 4:
            // BookStack에서 맨 위의 도서를 확인하고 (peekBook), 해당 도서의 정보를 출력
            Book<Integer> peekedBookOfStack = bookStack.peekBook();
            peekedBookOfStack.printInfo();
            System.out.println();

            break;

          case 5:
            // BookStack에서 도서를 꺼내고 (popBook), 꺼낸 도서의 정보를 출력
            Book<Integer> poppedBookOfStack = bookStack.popBook();
            poppedBookOfStack.printInfo();
            System.out.println();

            break;

          case 6:
            // BookStack이 비어있는지 확인하고 (isEmpty), 결과를 출력
            if (bookStack.isEmpty()) {
              System.out.println("책 스택이 비었습니다!");
            }

            break;

          case 7:
            // 책 삭제
            title = scanner.nextLine();
            author = scanner.nextLine();
            identifier = scanner.nextLine();

            Book<String> book = new Book<>(title, author, identifier);
            bookShelf.removeBook(book);
            System.out.println(title + " 책이 삭제 되었습니다.");

            break;

          case 8:
            // 종료
            scanner.close();
            isStop = true;
            System.out.println("프로그램을 종료합니다.");
            break;
        }
      } catch (EmptyStackException e) {
        System.out.println("BookStack is Empty!!!");
      }
    }
  }
}
