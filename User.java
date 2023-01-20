
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
  public String name;
  public LocalDate birthDay;
  public ArrayList<Book> borrowedBooks = new ArrayList<>();

  // Constructor method
  User () {
    this.name = null; 
    this.birthDay = null; 
  }

  User (String name) {
    this.name = name;
    this.birthDay = null;
  }
  
  User(String name, String birthDay) {
    this.name = name; 
    this.birthDay = LocalDate.parse(birthDay); 
  }

  public String toString() {
    String toPrint = this.name + ", " + this.birthDay; 
    return toPrint;
  }

  public int age() {
    return Period.between(this.birthDay, LocalDate.now()).getYears();
  }

  public void borrow(Book book) {
    this.borrowedBooks.add(book); 
  }

  public void returnBook(Book book) {
    this.borrowedBooks.remove(book);
  }
}
