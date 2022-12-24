package org.launchcode.java.demos.lsn3classes1;

import java.util.Objects;

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

  public String getGradeLevel() {
    if (this.numberOfCredits <= 29)
      return "Freshman";
    if (this.numberOfCredits <= 59)
      return "Sophomore";
    if (this.numberOfCredits <= 89)
      return "Junior";
    return "Senior";
  }

  public void addGrade(int credits, double grade) {
    double totalQualityScore = this.gpa * this.numberOfCredits;
    totalQualityScore += credits * grade;
    this.numberOfCredits += credits;
    this.gpa = totalQualityScore/this.numberOfCredits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return numberOfCredits == student.numberOfCredits;
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfCredits);
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            '}';
  }

  public void setName(String aName) { name = aName; }
  public void setNumberOfCredits(int aNumberOfCredits) { numberOfCredits = aNumberOfCredits; }
  public void setGpa(double aGpa) { gpa = aGpa; }

  public String getName() { return name; }
  public int getStudentId() { return studentId; }
  public int getNumberOfCredits() { return numberOfCredits; }
  public double getGpa() { return gpa; }
}