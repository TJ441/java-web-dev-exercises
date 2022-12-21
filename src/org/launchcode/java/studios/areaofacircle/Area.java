package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter radius:");
    Double radius = input.nextDouble();
    System.out.println("Area is " + (3.14159 * radius * radius));
    input.close();
  }
}