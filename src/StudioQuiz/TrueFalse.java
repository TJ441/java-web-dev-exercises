package StudioQuiz;

public class TrueFalse extends Question {
  private boolean answer;
  private boolean isCorrect;

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

  public boolean getIsCorrect() {
    return this.isCorrect;
  }

  public void checkAnswer(boolean answer) {
    this.isCorrect = answer == this.answer;
  }
}