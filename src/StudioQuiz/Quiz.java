package StudioQuiz;
import java.util.Scanner;

public class Quiz {
  public static void printQuiz() {
    Scanner input = new Scanner(System.in);
    TrueFalse question1 = new TrueFalse("The Earth is bigger than the Moon", true);
    System.out.print("Question 1 (true or false) - " + question1.getQuestion() + "\nRespond here: ");
    boolean answer = input.nextBoolean();

    if (answer == question1.getAnswer())
      System.out.print("Correct");
    else System.out.print("Incorrect");
  }
}
