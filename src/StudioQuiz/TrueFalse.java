package StudioQuiz;

public class TrueFalse extends Question {
  private boolean answer;

  public TrueFalse(String aQuestion, boolean answer) {
    super(aQuestion);
    this.answer = answer;
  }

  public boolean getAnswer() {
    return answer;
  }
  public void setAnswer(boolean aAnswer) {
    answer = aAnswer;
  }
}
