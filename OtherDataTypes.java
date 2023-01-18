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
  }
}