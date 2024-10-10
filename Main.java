import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)

  {
    //PROBLEM 1
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a positive integer: ");
    int inputedInt = userInput.nextInt();
    printRandom3(inputedInt);

    //PROBLEM 2
    System.out.println("Enter the first x-cordinate: ");
    double x1 = userInput.nextDouble();

    System.out.println("Enter the second x-cordinate: ");
    double x2 = userInput.nextDouble();

    System.out.println("Enter the first y-cordinate: ");
    double y1 = userInput.nextDouble();

    System.out.println("Enter the second y-cordinate: ");
    double y2 = userInput.nextDouble();

    System.out.println("The slope is: " + calcSlope(x1, x2, y1, y2));

    //PROBLEM 3
    System.out.println("Enter two doubles: ");
    double x = userInput.nextDouble();
    double y = userInput.nextDouble();
    System.out.println("Distance: " + roundDist(x,y));

  }

  public static void printRandom3(int n){
    System.out.println("Random numbers: ");
    for (int i = 0; i < 4; i++){
       System.out.println((Math.random() * 2) + n );
    }
  }

  public static double calcSlope(double x1, double x2, double y1, double y2){
      return ((y2 - y1) / (x2 - x1));
  }

  public static double roundDist(double x, double y){
      double distance = Math.abs(y - x);
      int roundedVal = (int) (distance + 0.5);
      return roundedVal;
  }



  // write your methods here
}
