package exercises.technology;

public class SmartPhone extends Computer {
  private final boolean replaceableBattery;

  public SmartPhone (int aRam, String aOperatingSystem, int aStorage, boolean aReplaceableBattery) {
    super(aRam, aOperatingSystem, aStorage);
    replaceableBattery = aReplaceableBattery;
  }

  public void printRam() {
    System.out.print(ram);
  }

  public void printOperatingSystem() {
    System.out.print(operatingSystem);
  }

  public void printStorage() {
    System.out.print(storage);
  }

  public void printBatteryInfo() {
    System.out.print(replaceableBattery);
  }
}
