package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Rectangle height:");
    int height = input.nextInt();
    System.out.println("Rectangle width:");
    int width = input.nextInt();
    System.out.println("Area is " + (height * width));
  }
}
