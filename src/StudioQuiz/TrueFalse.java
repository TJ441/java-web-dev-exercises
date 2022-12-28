package StudioQuiz;

public class TrueFalse extends Question {
  private boolean answer;

  public TrueFalse(String aQuestion, boolean aAnswer) {
    super(aQuestion);
    answer = aAnswer;
  }

  public boolean getAnswer() {
    return this.answer;
  }
  public void setAnswer(boolean aAnswer) {
    this.answer = aAnswer;
  }

  public boolean checkAnswer(boolean answer) {
    return answer == this.answer;
  }
}