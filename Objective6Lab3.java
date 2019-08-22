public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 0;

    while(counter != 20) {
      counter++;
      if(counter % 2 != 0) {
        System.out.println("The number " + counter + " is odd");
      }
      else {
        System.out.println("The number " + counter + " is even");
      }
    }
  }
}
