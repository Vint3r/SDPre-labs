import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true) {
      System.out.println("_____MENU_____");
      System.out.println("1: Say Hello.");
      System.out.println("2: List My Favorite Foods.");
      System.out.println("3: Exit.");
      selection = scanner.nextInt();
      if(selection == 1) {
        System.out.println("Hello World.");
      }
      else if(selection == 2) {
        System.out.println("Pizza, Steak, Tacos.");
      }
      else {
         System.out.println("Goodbye.");
         break;
      }
    }
  }
}
