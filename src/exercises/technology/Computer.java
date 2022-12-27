package exercises.technology;

public abstract class Computer {
  private String brand;
  private String operatingSystem;
  private int storage;

  public Computer(String aBrand, String aOperatingSystem, int aStorage) {
    brand = aBrand;
    operatingSystem = aOperatingSystem;
    storage = aStorage;
  }

  public abstract String identify();
  public abstract void printIdentity();
  public abstract void printStorage();

}
