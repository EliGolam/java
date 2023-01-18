import java.util.Arrays;

public class ExerciseArrays {
  public static void main(String[] args) {
    String characters[] = new String[3];

    characters[0] = "Lorraine";
    characters[1] = "Britney";
    characters[2] = "Vivian";

    Arrays.sort(characters);

    System.out.println(Arrays.toString(characters));

    int nums[] = {1, 2, 3, 4, 5}; 
    System.out.println(Arrays.toString(nums));

    int randomValues[] = new int[5];
    Arrays.fill(randomValues, 0);

    System.out.println(Arrays.toString(randomValues));
    System.out.printf("The sum of the array nums is %d", Arrays.stream(nums).sum());
  }
}
