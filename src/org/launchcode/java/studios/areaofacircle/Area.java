package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter radius:");
    double radius = input.nextDouble();
    while (radius < 0) {
      System.out.println("Enter a positive number:");
      radius = input.nextDouble();
    }
    System.out.println("Area is " + Circle.getArea(radius));
    input.close();
  }
}