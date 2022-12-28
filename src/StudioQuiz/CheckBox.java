package StudioQuiz;

import java.util.Objects;

public class CheckBox extends Question {
  private String answer;

  public CheckBox(String aQuestion, String aAnswer) {
    super(aQuestion);
    this.answer = aAnswer;
  }

  public String getAnswer() {
    return this.answer;
  }
  public void setAnswer(String aAnswer) {
    answer = aAnswer;
  }

  public boolean checkAnswer(String answer) {
    return Objects.equals(answer, this.answer);
  }
}