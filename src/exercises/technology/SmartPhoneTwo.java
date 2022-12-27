package exercises.technology;
public class SmartPhoneTwo extends Computer {

  private int numberOfSelfies;

  public SmartPhoneTwo(int storage, int ram, boolean hasKeyboard, int numberOfSelfies) {
    super(storage, ram, hasKeyboard);
    this.numberOfSelfies = numberOfSelfies;
  }

  public int getNumberOfSelfies() {
    return this.numberOfSelfies;
  }
  public void setNumberOfSelfies(int aNumberOfSelfies) {
    numberOfSelfies = aNumberOfSelfies;
  }

  public void takeSelfie() {
    this.numberOfSelfies = this.numberOfSelfies + 1;
  }
}