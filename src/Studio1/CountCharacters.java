package Studio1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class CountCharacters {
  public static void main(String[] args) {
    String paragraph = "If the product of two terms is zero then common sense says at least " +
                       "one of the two terms has to be zero to start with. So if you move all the terms " +
                       "over to one side, you can put the quadratics into a form that can be factored allowing " +
                       "that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
                       "straightforward from there.";

    char[] charArray = paragraph.toCharArray();
    ArrayList<Integer> countArray = new ArrayList<>();

    for (int i = 0; i < charArray.length; i++) {
      System.out.print(charArray[i]);
    }
  }
}
