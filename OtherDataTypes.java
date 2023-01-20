import java.util.ArrayList;
import java.util.Comparator;

class OtherDataTypes {
  public static void main(String[] args) {
    // <> is a wrapper class. <Integer> is the reference type for int
    ArrayList<Integer> nums = new ArrayList<Integer>();

    nums.add(21);
    nums.add(14);
    nums.add(16);
    nums.add(1);
    nums.add(41);
    nums.add(15);
    nums.add(18);
    nums.add(71);
    nums.add(31);

    System.out.println(nums.toString());

    nums.sort(Comparator.naturalOrder());
    System.out.printf("Ordered array %s\n", nums.toString());

    nums.sort(Comparator.reverseOrder());
    System.out.printf("Reverse Order %s\n", nums.toString());

    System.out.printf("The size of the array is: %d\n", nums.size());
    System.out.printf("Does the arraylist containt 16? %s\n", nums.contains(16));
    System.out.printf("Does the arraylist contain 22? %s\n", nums.contains(22));

    nums.forEach(num -> {
      System.out.println(num * 2);
    });

    System.out.printf("Is the arraylist empty? %s\n", nums.isEmpty());
    nums.clear();
    System.out.printf("Is the arraylist empty after being cleared? %s\n", nums.isEmpty());
  }
}