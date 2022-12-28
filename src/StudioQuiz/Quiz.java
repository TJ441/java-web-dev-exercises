package StudioQuiz;
import java.util.Arrays;
import java.util.ArrayList;

public class Quiz {
  private final ArrayList<Question> questions;

  public Quiz(ArrayList<Question> aQuestions) {
    questions = aQuestions;
  }

  public void printQuiz() {
    System.out.print(questions);
  }
}