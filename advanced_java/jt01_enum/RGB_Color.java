package jt01_enum;

enum RGB_Color {
  // You can define a value of the enum type, but it needs some extra constructor and return values
  RED("red"),
  GREEN("green"),
  BLUE("blue");

  private String value; 

  RGB_Color(String value) {
    this.value = value; 
  }

  public String getValue() {
    return value;
  }
}
