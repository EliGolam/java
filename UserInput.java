import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    // Scanner Object to collect user input
    Scanner scanner = new Scanner(System.in);

    System.out.print("What's your name? ");
    String name = scanner.nextLine();

    System.out.printf("My name is: %s\n", name);

    System.out.print("Are you ready? ");
    String ready = scanner.nextLine();
    
    if (ready.equalsIgnoreCase("yes")) {
      System.out.println("Nice! Let's start");
    }
    else {
      System.out.println("What a shame. Maybe next time. Bye!");
    }
  }  
}
