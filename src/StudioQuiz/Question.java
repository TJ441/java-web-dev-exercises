package StudioQuiz;

public abstract class Question {
  private final String question;

  public Question(String question) {
    this.question = question;
  }

  public String getQuestion() {
    return this.question;
  }
  //Here and/or in subclasses goes "functionality to display questions and answers" which I
  //think they mean the getters and setters, in which case I've done that part.

  //Here and/or in subclasses goes equality testing, if I understand instructions correctly
}
