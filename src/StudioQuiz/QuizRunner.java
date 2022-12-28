package StudioQuiz;
import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
  public static void main(String[] args) {
    ArrayList<Question> questions = new ArrayList<>(Arrays.asList(
      new TrueFalse("The Earth is bigger than the Moon", true),
      new TrueFalse("Earth's atmosphere is 78% nitrogen", true),
      new TrueFalse("Pluto is considered a planet", false),
      new MultipleChoice("Is it a, b or c?", 'a'),
      new MultipleChoice("Is it c, b or a?", 'c'),
      new CheckBox("Just pick a: ", 'a')
    ));

    Quiz quiz = new Quiz(questions);
    quiz.printQuiz();
  }
}
