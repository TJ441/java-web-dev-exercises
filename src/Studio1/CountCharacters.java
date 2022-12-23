package Studio1;
import java.util.Scanner;
public class CountCharacters {
  public static void main(String[] args) {
    String paragraph = "If the product of two terms is zero then common sense says at least " +
                       "one of the two terms has to be zero to start with. So if you move all the terms " +
                       "over to one side, you can put the quadratics into a form that can be factored allowing " +
                       "that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
                       "straightforward from there.";
    char[] charArray = paragraph.toCharArray();

    Scanner input = new Scanner(System.in);
    System.out.print("Enter character to count: ");
    String charToConvert = input.next();
    char[] converted = charToConvert.toCharArray();
    char character = converted[0];

    int count = 0;
    for (char c : charArray)
      if (c == character)
        count++;

    System.out.print("Number of " + character + "'s = " + count);
  }
}