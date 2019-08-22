import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true) {
      printMenu();
      selection = scanner.nextInt();

      if(selection == 1) {
        System.out.println("Hello Human.");
      }
      else if(selection == 2) {
        System.out.println("Tacos, Steak, Pizza");
      }
      else if(selection == 3) {
        System.out.println("Goodbye");
        break;
      }
    }
  }
  public static void printMenu() {
    System.out.println("____MENU____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My Favorite Foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
