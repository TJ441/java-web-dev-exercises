package exercises.technology;

  public class SmartPhoneTwo extends Computer {
    private boolean replaceableBattery;

    public SmartPhoneTwo (int aRam, String aOperatingSystem, int aStorage, boolean aReplaceableBattery) {
      super(aRam, aOperatingSystem, aStorage);
      replaceableBattery = aReplaceableBattery;
    }

    public boolean getReplaceableBattery() {
      return replaceableBattery;
    }
    public void setReplaceableBattery(boolean aReplaceableBattery) {
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

