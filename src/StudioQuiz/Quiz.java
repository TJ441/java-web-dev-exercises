package StudioQuiz;
import java.util.Arrays;
import java.util.ArrayList;

public class Quiz {
  private static final ArrayList<TrueFalse> trueFalseQuestions = new ArrayList<>(Arrays.asList(
    new TrueFalse("The Earth is bigger than the Moon", true),
    new TrueFalse("Earth's atmosphere is 78% nitrogen", true),
    new TrueFalse("Pluto is considered a planet", false)
  ));

  private static final ArrayList<MultipleChoice> multipleChoiceQuestions = new ArrayList<>(Arrays.asList(
    new MultipleChoice("Is it a, b or c?", 'a'),
    new MultipleChoice("Is it c, b or a?", 'c')
  ));

  public static void printQuiz() {
    for (TrueFalse q : trueFalseQuestions) {
      System.out.print("Question: " + q.getQuestion() + "\n" + q.getAnswer() + "\n");
    }
    for (MultipleChoice q : multipleChoiceQuestions) {
      System.out.print("Question: " + q.getQuestion() + "\n" + q.getAnswer() + "\n");
    }
  }
}