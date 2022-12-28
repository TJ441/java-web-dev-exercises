package StudioQuiz;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
  private final ArrayList<TrueFalse> trueFalse;
  private final ArrayList<MultipleChoice> multipleChoice;
  private final ArrayList<CheckBox> checkBox;

  public Quiz(ArrayList<TrueFalse> aTrueFalse,
              ArrayList<MultipleChoice> aMultipleChoice,
              ArrayList<CheckBox> aCheckBox) {

    trueFalse = aTrueFalse;
    multipleChoice = aMultipleChoice;
    checkBox = aCheckBox;
  }

  public void printQuiz() {
    Scanner input = new Scanner(System.in);
    System.out.print(trueFalse.get(0).getQuestion() + "\n");
    System.out.print("Answer 'true' or 'false': ");
    boolean answer = input.nextBoolean();
    trueFalse.get(0).checkAnswer(answer);
    System.out.print(trueFalse.get(0).getIsCorrect());

    /*for (TrueFalse q : trueFalseQuestions) {
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
  //Here executes the quiz, as I've done already to a degree
    //Here goes addQuestion function, which I haven't done
    //Here goes grading the quiz, which I haven't done

}