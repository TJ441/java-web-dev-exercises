package exercises.technology;

public abstract class AbstractEntity {
  private static int nextId = 1;
  private final int id;

  public AbstractEntity() {
    this.id = nextId;
    nextId++;
  }

  public int getId() {
    return this.id;
  }
}
