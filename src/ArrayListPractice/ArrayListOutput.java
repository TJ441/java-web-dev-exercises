package ArrayListPractice;
import java.util.ArrayList;
import static ArrayListPractice.SumEven.sumEvens;

public class ArrayListOutput {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      nums.add(i);
    }
    System.out.println(sumEvens(nums));
  }
}