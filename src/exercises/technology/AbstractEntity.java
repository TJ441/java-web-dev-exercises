package exercises.technology;

public abstract class AbstractEntity {
  static int nextId = 0;
  int id;

  public AbstractEntity() {
    this.id = nextId;
    nextId++;
  }
}
