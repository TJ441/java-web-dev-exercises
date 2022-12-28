package StudioQuiz;

public class MultipleChoice extends Question {
  private char answer;

  public MultipleChoice(String aQuestion, char aAnswer) {
    super(aQuestion);
    this.answer = aAnswer;
  }

  public char getAnswer() {
    return this.answer;
  }
  public void setAnswer(char aAnswer) {
    answer = aAnswer;
  }

  public boolean checkAnswer(char answer) {
    return answer == this.answer;
  }
}