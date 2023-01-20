import java.time.LocalDate;
import java.time.Period;

public class BookProgram {
  public static void main(String[] args) {
    User user1 = new User();
    user1.name = "Book Nerd";
    user1.birthDay = LocalDate.parse("1999-02-12"); 

    System.out.println(user1.toString());

    System.out.println(user1.age());

    Book carmilla = new Book();
    carmilla.title = "Carmilla";
    carmilla.author = "Sheridan Le Fanu"; 

    Book book1 = new Book();
    book1.title = "Book 1";
    book1.author = "Author 1";

    System.out.println(carmilla.toString());

    user1.borrow(carmilla);
    user1.borrow(book1);
    System.out.println(user1.borrowedBooks.toString());

    User lorraine = new User("Lorraine", "1927-11-27");
    Book murder = new Book("How to murder", "Lady Blade"); 
    AudioBook audiobook1 = new AudioBook("AudioBook2", "Author 2", 340);

    lorraine.borrow(murder);
    lorraine.borrow(book1);
    lorraine.borrow(audiobook1);

    System.out.println(lorraine.toString());
    System.out.println(lorraine.borrowedBooks.toString());
  }
}
