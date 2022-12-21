package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter radius:");
    Double radius = input.nextDouble();
    Double pi = 3.14;
    Double area = pi * radius * radius;
    System.out.println("Area is " + area);
    input.close();
  }
}