package PracticeHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentHashMap {
  public static void main(String[] args) {
    HashMap<Integer, String> classRoster = new HashMap<>();
    Scanner input = new Scanner(System.in);
    String student;

    System.out.println("Enter student name (or ENTER to finish): ");

    do {
      System.out.print("Student: ");
      student = input.nextLine();
      if (!student.equals("")) {
        System.out.print("ID: ");
        Integer id = input.nextInt();
        classRoster.put(id, student);
        input.nextLine();
      }
    } while(!student.equals(""));

    input.close();

    System.out.println("\nClass Roster:");

    for (Map.Entry<Integer, String> entry : classRoster.entrySet()) {
      System.out.println(entry.getValue() + "'s ID: " + entry.getKey());
    }

    System.out.println("Number of students in roster: " + classRoster.size());
  }
}
