package exercises.technology;
public class Laptop extends Computer {

  private double weight; // laptop weight in pounds.

  public Laptop(int storage, int ram, boolean hasKeyboard, double weight) {
    super(storage, ram, hasKeyboard);
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }
  public void setWeight(double aWeight) {
    weight = aWeight;
  }

  public boolean isClunky() {
    return (weight > 5.0);
  }
}