package exercises.technology;

public class Program {
  public static void main(String[] args) {
    Laptop myLaptop = new Laptop(4, "Ubuntu", 500, 17);
    SmartPhoneTwo mySmartPhone = new SmartPhoneTwo(8, "Android", 32, true);
    System.out.print(myLaptop.id);
    System.out.print(mySmartPhone.id);
  }
}
