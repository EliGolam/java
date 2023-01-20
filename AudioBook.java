public class AudioBook extends Book {
  private int runtime; 

  AudioBook(String title, String author, int runtime) {
    this.title = title;
    this.author = author;
    this.runtime = runtime; 
  }

  public int getRuntime() {
    return this.runtime; 
  }

  public void setRuntime(int runtime) {
    if (runtime > 0) {
      this.runtime = runtime; 
    }
    else {
      System.out.println("Not valid runtime value");
    }
  }

  public String toString() {
    return String.format("{Title: %s by Author: %s, Audiobook length: %d min}", this.title, this.author, this.runtime);
  }
}
