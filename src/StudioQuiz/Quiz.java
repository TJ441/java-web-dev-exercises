package StudioQuiz;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
  private final ArrayList<TrueFalse> trueFalseQuestions;
  private final ArrayList<MultipleChoice> multipleChoiceQuestions;
  private final ArrayList<CheckBox> checkBoxQuestions;

  public Quiz(ArrayList<TrueFalse> aTrueFalseQuestions,
              ArrayList<MultipleChoice> aMultipleChoiceQuestions,
              ArrayList<CheckBox> aCheckBoxQuestions) {

    trueFalseQuestions = aTrueFalseQuestions;
    multipleChoiceQuestions = aMultipleChoiceQuestions;
    checkBoxQuestions = aCheckBoxQuestions;
  }

  public void printQuiz() {
    Scanner input = new Scanner(System.in);
    System.out.print(trueFalseQuestions.get(0).getQuestion() + "\n");
    System.out.print("Answer 'true' or 'false': ");
    Boolean answer = input.nextBoolean();
    if (answer == trueFalseQuestions.get(0).getAnswer())
      System.out.print("Correct");
    else System.out.print("Incorrect");

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
  //Here executes the quiz, as I've done already
    //Here goes addQuestion function, which I haven't done
    //Here goes grading the quiz, which I haven't done

}