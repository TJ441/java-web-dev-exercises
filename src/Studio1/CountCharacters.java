package Studio1;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CountCharacters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Type in text to analyze: ");
    String paragraph = input.nextLine();
    char[] charArray = paragraph.toLowerCase().toCharArray();
    HashMap<Character, Integer> charCounts = new HashMap<>();

    for (char character : charArray) {
      int count = 0;
      for (char c : charArray)
        if (c == character)
          count++;
      charCounts.put(character, count);
    }
    for (Map.Entry<Character, Integer> character : charCounts.entrySet()) {
      System.out.println(character.getKey() + ": " + character.getValue());
    }
  }
}