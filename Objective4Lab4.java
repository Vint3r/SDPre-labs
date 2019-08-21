import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args){
    Scanner user = new Scanner(System.in);
    int userNum;

    System.out.println("Provide a number please: ");
    userNum = user.nextInt();

    if(userNum % 2 == 0) {
      System.out.println("The provided number: " + userNum + ", is even.");
    }
    else if(userNum % 2 != 0) {
      System.out.println("The provided number: " + userNum + ", is odd.");
    }
  }
}
