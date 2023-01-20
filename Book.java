public class Book {
  public String title;
  public String author;

  Book() {
    this.title = null; 
    this.author = null; 
  }

  Book(String title, String author) {
    this.title = title; 
    this.author = author; 
  }

  public String toString() {
    return String.format("{Title: %s by Author: %s}", this.title, this.author);
  } 
}
