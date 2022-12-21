package exercises;
import java.util.Scanner;
public class SearchString {
  public static void main(String[] args) {
    String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                       "and of having nothing to do: once or twice she had peeped into the book her " +
                       "sister was reading, but it had no pictures or conversations in it, 'and what " +
                       "is the use of a book,' thought Alice 'without pictures or conversation?'";
    String sentence = paragraph.toLowerCase();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter search term:");
    String search = input.next().toLowerCase();
    System.out.println(sentence.contains(search));
    System.out.println(sentence.indexOf(search));
    System.out.println(search.length());
    String newParagraph = sentence.replace(search, "");
    System.out.println(newParagraph);
    input.close();
  }
}
