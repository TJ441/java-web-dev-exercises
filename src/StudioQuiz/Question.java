package StudioQuiz;

public abstract class Question {
  private String question;

  public Question(String question) {
    this.question = question;
  }

  public String getQuestion() {
    return this.question;
  }
  public void setQuestion(String aQuestion) {
    question = aQuestion;
  }
}
