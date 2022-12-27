package exercises.technology;

public abstract class Computer {
  int ram;
  String operatingSystem;
  int storage;

  public Computer(int aRam, String aOperatingSystem, int aStorage) {
    ram = aRam;
    operatingSystem = aOperatingSystem;
    storage = aStorage;
  }

  public abstract void printRam();
  public abstract void printOperatingSystem();
  public abstract void printStorage();
}
