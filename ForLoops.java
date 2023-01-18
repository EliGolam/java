import java.util.Arrays;

public class ForLoops {
  public static void main(String[] args) {
    String characters[] = {"Lorriane", "Britney", "Vivian"}; 

    // Method 1: with index
    for(int i = 0; i < characters.length; i++) {
      System.out.printf("%s is an amazing character!\n", characters[i]);
    }

    // Method 2
    for(String character : characters) {
      System.out.printf("%s is one of my favourite characters\n", character);
    }

    // Method 3: for each only works for Stream, Map, Set and List datasets
    Arrays.stream(characters).forEach(character -> {
      System.out.printf("%s is hot\n", character);
    });
  }
}
