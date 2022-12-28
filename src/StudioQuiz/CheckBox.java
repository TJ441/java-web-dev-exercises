package StudioQuiz;

public class CheckBox extends Question {
  private char answer;

  public CheckBox(String aQuestion, char aAnswer) {
    super(aQuestion);
    this.answer = aAnswer;
  }

  public char getAnswer() {
    return this.answer;
  }
  public void setAnswer(char aAnswer) {
    answer = aAnswer;
  }
}