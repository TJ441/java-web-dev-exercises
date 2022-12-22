package ArrayListPractice;
import java.util.ArrayList;
public class SumEven {
  public static int sumEvens(ArrayList<Integer> bastard) {
    int sum = 0;
    for (int num : bastard) {
      if (num % 2 == 0) {
        sum += num;
      }
    }
    return sum;
  }
}