package org.launchcode.java.demos.lsn3classes1;

public class Student {
  private static int nextStudentId = 100;
  private String name;
  private final int studentId;
  private int numberOfCredits;
  private double gpa;

  public Student(String name, int numberOfCredits, double gpa) {
    this.name = name;
    this.studentId = nextStudentId;
    this.numberOfCredits = numberOfCredits;
    this.gpa = gpa;
    nextStudentId++;
  }

  public Student(String name, int numberOfCredits) {
    this(name, numberOfCredits, 0);
  }

  public Student(String name) {
    this(name, 0, 0);
  }

  public void setName(String aName) { name = aName; }
  public void setNumberOfCredits(int aNumberOfCredits) { numberOfCredits = aNumberOfCredits; }
  public void setGpa(double aGpa) { gpa = aGpa; }

  public String getName() { return name; }
  public int getStudentId() { return studentId; }
  public int getNumberOfCredits() { return numberOfCredits; }
  public double getGpa() { return gpa; }
}