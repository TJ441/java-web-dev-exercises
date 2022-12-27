package exercises.technology;

public class Laptop extends Computer {
  private int screenSize;

  public Laptop(int aRam, String aOperatingSystem, int aStorage, int aScreenSize) {
    super(aRam, aOperatingSystem, aStorage);
    screenSize = aScreenSize;
  }

  public int getRam() {
    return ram;
  }
  public void setRam(int aRam) {
    ram = aRam;
  }

  public String getOperatingSystem() {
    return operatingSystem;
  }
  public void setOperatingSystem(String aOperatingSystem) {
    operatingSystem = aOperatingSystem;
  }

  public int getStorage() {
    return storage;
  }
  public void setStorage(int aStorage) {
    storage = aStorage;
  }

  public int getScreenSize() {
    return screenSize;
  }
  public void setScreenSize(int aScreenSize) {
    screenSize = aScreenSize;
  }

  public void printRam() {
    System.out.print(ram);
  }

  public void printOperatingSystem() {
    System.out.print(this.operatingSystem);
  }

  public void printStorage() {
    System.out.print(storage);
  }

  public void printScreenSize() {
    System.out.print(screenSize);
  }
}
