package jt01_enum;

public class Application {
  public static void main(String[] args) {
    /******************************************************************************* 
    / Enumerated types: 
    / Define CONSTANTS that will not change throughout the cycle of the software
    / They can be interpreted by multiple components the same way
    / These can be attributes, methods and constructors
    / Type-safe enumerations, they are not Strings, Arrays, etc.
    *******************************************************************************/

    /* CREATE variable from enum */
    RGB_Color color1 = RGB_Color.RED;

    System.out.println("Red Enum name: " + color1.name());
    System.out.println("Red Enum value: " + color1.getValue());

    /* Iterate over the enum types */
    for (RGB_Color color : RGB_Color.values()) {
      System.out.printf("Enum values: %s\n", color.getValue());
    }
  }
}