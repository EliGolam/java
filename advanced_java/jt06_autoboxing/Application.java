package jt06_autoboxing;

public class Application {
  public static void main(String[] args) {
    int i = 10;
    char letter = 'A';

    // AUTOBOX
    Integer numObj = i; 
    System.out.printf("Value of %s: %d\n", numObj.getClass(), numObj);

    // UNBOXING
    int num = numObj;
    System.out.printf("Value of Int: %d\n", num);


    // AUTOBOXING
    Character charObj = letter;
    System.out.printf("Value of %s: %s\n", charObj.getClass(), charObj); 

    // UNBOXING
    char ch = charObj; 
    System.out.printf("Value of char: %s\n", ch);
  }
}

/* AUTOBOXING
 * Conversion of Primitive data type into the corresponding object wrapper class
 * int -> Integer
 * char -> Character
 * double -> Double
 * 
 * It's used for collection or any other element where we need an Object instead of 
 * a primitive. 
 * In the wrapper class we have a reference to the primitive type. 
 * 
 * Unboxing is the opposite
 */