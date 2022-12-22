package ArrayListPractice.FiveLetterWords;
import java.util.ArrayList;
import java.util.Scanner;
public class BuildArray {
  public static ArrayList<String> buildArray (String phrase) {
    ArrayList<String> wordsArray = new ArrayList<>();
    String[] words = phrase.split(" ");
    Scanner input = new Scanner(System.in);
    System.out.println("Choose word length: ");
    int length = input.nextInt();
    for (String word : words)
      if (word.length() == length)
        wordsArray.add(word);

    return wordsArray;
  }
}