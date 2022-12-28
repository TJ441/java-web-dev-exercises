package StudioQuiz;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
  private final ArrayList<TrueFalse> trueFalse;
  private final ArrayList<MultipleChoice> multipleChoice;
  private final ArrayList<CheckBox> checkBox;
  private double correctAnswers = 0;
  private double numberOfQuestions = 0;

  public Quiz(ArrayList<TrueFalse> aTrueFalse,
              ArrayList<MultipleChoice> aMultipleChoice,
              ArrayList<CheckBox> aCheckBox) {

    trueFalse = aTrueFalse;
    multipleChoice = aMultipleChoice;
    checkBox = aCheckBox;
  }

  public void printQuiz() {
    Scanner input = new Scanner(System.in);
    for (TrueFalse q : trueFalse) {
      System.out.print(q.getQuestion() + "\n");
      System.out.print("Answer 'true' or 'false': ");
      boolean answer = input.nextBoolean();
      this.numberOfQuestions++;

      if (q.checkAnswer(answer)) {
        this.correctAnswers++;
        System.out.print("Correct\n");
      } else {
        System.out.print("Incorrect\nCorrect answer is " + q.getAnswer() + "\n");
      }
    }

    for (MultipleChoice q : multipleChoice) {
      System.out.print(q.getQuestion() + "\n");
      System.out.print("Answer a, b or c: ");
      String answer = input.next();
      this.numberOfQuestions++;

      if (q.checkAnswer(answer)) {
        this.correctAnswers++;
        System.out.print("Correct\n");
      } else {
        System.out.print("Incorrect\nCorrect answer is " + q.getAnswer() + "\n");
      }
    }

    for (CheckBox q : checkBox) {
      System.out.print(q.getQuestion() + "\n");
      System.out.print("Answer all that apply: ");
      String answer = input.next();
      this.numberOfQuestions++;

      if (q.checkAnswer(answer)) {
        this.correctAnswers++;
        System.out.print("Correct\n");
      } else {
          System.out.print("Incorrect\nCorrect answer is " + q.getAnswer() + "\n");
      }
    }
  }

  public double gradeQuiz() {
    return Math.round((correctAnswers / numberOfQuestions) * 100);
  }

    //Here goes addQuestion function, to be called from QuizRunner, which I haven't done
}