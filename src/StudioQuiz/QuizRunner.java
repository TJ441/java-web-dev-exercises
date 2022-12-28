package StudioQuiz;
import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
  public static void main(String[] args) {
    ArrayList<TrueFalse> trueFalseQuestions = new ArrayList<>(Arrays.asList(
      new TrueFalse("The Earth is bigger than the Moon", true),
      new TrueFalse("Earth's atmosphere is 78% nitrogen", true),
      new TrueFalse("Pluto is considered a planet", false)
    ));

    ArrayList<MultipleChoice> multipleChoiceQuestions = new ArrayList<>(Arrays.asList(
      new MultipleChoice("Is it a, b or c?", 'a'),
      new MultipleChoice("Is it c, b or a?", 'c')
    ));

    ArrayList<CheckBox> checkBoxQuestions = new ArrayList<>(Arrays.asList(
      new CheckBox("Just pick a: ", 'a'),
      new CheckBox("Just pick b: ", 'b')
    ));

    Quiz quiz = new Quiz(trueFalseQuestions, multipleChoiceQuestions, checkBoxQuestions);
    quiz.printQuiz();
  }
}
