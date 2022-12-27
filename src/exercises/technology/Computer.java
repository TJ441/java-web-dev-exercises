package exercises.technology;
public class Computer extends AbstractEntity {
  private int ram;
  private int storage;
  private boolean hasKeyboard;

  public Computer(int storage, int ram, boolean hasKeyboard) {
    this.ram = ram;
    this.storage = storage;
    this.hasKeyboard = hasKeyboard;
  }

  public int getStorage() {
    return this.storage;
  }
  public void setStorage(int aStorage) {
    storage = aStorage;
  }

  public int getRam() {
    return this.ram;
  }
  public void setRam(int aRam) {
    ram = aRam;
  }

  public boolean getHasKeyboard() {
    return this.hasKeyboard;
  }
  public void setHasKeyboard(boolean aHasKeyboard) {
    hasKeyboard = aHasKeyboard;
  }

  public void increaseRAM (int n) {
    this.ram = this.ram + n;
  }

  public void increaseStorage (int x) {
    this.storage = this.storage + x;
  }
}