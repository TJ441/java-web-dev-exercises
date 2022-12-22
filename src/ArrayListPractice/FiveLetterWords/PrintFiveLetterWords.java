package ArrayListPractice.FiveLetterWords;

import static ArrayListPractice.FiveLetterWords.BuildArray.buildArray;
public class PrintFiveLetterWords {
  public static void main(String[] args) {
    String phrase = "Write a static method to print out all the words in a list that have exactly 5 letters.";
    System.out.println(buildArray(phrase));
  }
}