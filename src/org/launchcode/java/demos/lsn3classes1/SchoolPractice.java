package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
  public static void main(String[] args) {
    Student firstStudent = new Student("Tim Johnson", 29, 3.0);
    Student secondStudent = new Student("Stacey Bullock", 32, 3.5);
    firstStudent.addGrade(3, 4.0);
    System.out.print(firstStudent.equals(secondStudent));
    System.out.print(firstStudent.toString());
  }
}