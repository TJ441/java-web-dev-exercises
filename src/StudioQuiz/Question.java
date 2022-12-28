package StudioQuiz;

public abstract class Question {
  private final String question;

  public Question(String question) {
    this.question = question;
  }

  public String getQuestion() {
    return this.question;
  }

}
