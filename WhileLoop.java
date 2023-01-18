public class WhileLoop {
  public static void main(String[] args) {
    int number = 5;
    int multiplier = 1;
    int result = 0;
    
    int goal = 34;

    while(result <= goal) {
      result = number * multiplier; 
      multiplier++; 
    }

    System.out.printf("The closest multiple of %d to %d is %d\n", number, goal, result);
    
    String characters[] = {"Lorriane", "Britney", "Vivian"}; 
    int i = -1;
    String characterToFind = "Britney";

    do {
      i++;
      System.out.println("Looking for the character");
    } while (!characters[i].equalsIgnoreCase(characterToFind));

    System.out.printf("Found %s!\n", characters[i]);
  }
}
