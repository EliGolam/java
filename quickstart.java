class QuickStart {
  // You can declare variables outside of main as static for all static methods
  static String name = "Britney";
  public static void main (String[] args) {
    System.out.println("Hello World!");

    int age = 22;
    System.out.printf("My name is %s, I'm %d", name, age);

    // Primitive Data: Hold a specific value
    byte oneByte = 100; 
    short smallNumber = 19000;
    int integer = 4395347; 
    long largeNumber = 922434224324L; // The final L is necessary to indicate a long number

    double doubleNumber = 1.784848; 
    float floatingNumber = 3.4028F; // Final F is necessary

    boolean a = true;
    boolean b = false; 

    char character = 'x';
    char aSymbol = '\u00A9'; 

    System.out.printf("\nThe length of the name is %d", name.length());
  }
}