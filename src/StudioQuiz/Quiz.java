package StudioQuiz;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
  private final ArrayList<TrueFalse> trueFalse;
  private final ArrayList<MultipleChoice> multipleChoice;
  private final ArrayList<CheckBox> checkBox;
  private double correctAnswers = 0;

  public Quiz(ArrayList<TrueFalse> aTrueFalse,
              ArrayList<MultipleChoice> aMultipleChoice,
              ArrayList<CheckBox> aCheckBox) {

    trueFalse = aTrueFalse;
    multipleChoice = aMultipleChoice;
    checkBox = aCheckBox;
  }

  public void printQuiz() {
    for (TrueFalse q : trueFalse) {
      Scanner input = new Scanner(System.in);
      System.out.print(q.getQuestion() + "\n");
      System.out.print("Answer 'true' or 'false': ");
      boolean answer = input.nextBoolean();

      if (q.checkAnswer(answer)) {
        this.correctAnswers++;
        System.out.print("Correct");
      } else {
          System.out.print("Incorrect");
      }
    }

    /*for (TrueFalse q : trueFalse) {
      System.out.print(q.getQuestion());
      System.out.print(q.getAnswer());
    }
    for (MultipleChoice q : multipleChoiceQuestions) {
      System.out.print(q.getQuestion());
      System.out.print(q.getAnswer());
    }
    for (CheckBox q : checkBoxQuestions) {
      System.out.print(q.getQuestion());
      System.out.print(q.getAnswer());
    }*/
  }

  public double gradeQuiz() {
    return (correctAnswers / 3.00) * 100;
  }
  //Here executes the quiz, as I've done already to a degree
    //Here goes addQuestion function, which I haven't done
    //Here goes grading the quiz, which I haven't done

}