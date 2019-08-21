import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double firstNum, secondNum, sum;

    System.out.println("Please input a number.");
    firstNum = input.nextDouble();

    System.out.println("Please input another number.");
    secondNum = input.nextDouble();

    sum = firstNum + secondNum;

    System.out.println("The sum of " + firstNum + " and " + secondNum + " is: " + sum);
  }
}
