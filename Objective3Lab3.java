import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    currentYear = 2019;
    birthYear = 2019 - age;

    System.out.println("Your birth year is: " + birthYear);
    input.close();
  }
}
