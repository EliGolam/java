import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    // Scanner Object to collect user input
    Scanner scanner = new Scanner(System.in);

    System.out.print("What's your name? ");
    String name = scanner.nextLine();
    scanner.close();

    System.out.printf("My name is: %s", name);

  }  
}
