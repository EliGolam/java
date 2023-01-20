import java.util.HashMap;

public class ExerciseHashMaps {
  public static void main(String[] args) {
    HashMap<String, Integer> characterAge = new HashMap<String, Integer>();

    characterAge.put("Lorraine", 28);
    characterAge.put("Britney", 22); 
    characterAge.put("Vivian", 30); 

    System.out.println(characterAge.toString());
  }
}
