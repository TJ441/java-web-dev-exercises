package exercises.ArrayPractice;
//import java.util.Scanner;

public class StringArray {
  public static void main(String[] args) {
    int[] fibArray = {1, 1, 2, 3, 5, 8};
    for (int i : fibArray) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}

