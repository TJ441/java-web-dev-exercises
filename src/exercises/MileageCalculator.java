package exercises;
import java.util.Scanner;
public class MileageCalculator {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Miles driven:");
    int miles = input.nextInt();

    System.out.println("Gallons used:");
    int gallons = input.nextInt();

    System.out.println("Mileage = " + (miles / gallons) + " mpg");
  }
}
