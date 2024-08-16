import java.util.Scanner;

public class S_intrest 
{

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principal amount: ");
    double principal = sc.nextDouble();
    System.out.print("Enter the rate of interest: ");
    double rate = sc.nextDouble();
    System.out.print("Enter the time period (in years): ");
    int time = sc.nextInt();

    double simpleInterest = calculateSimpleInterest(principal, rate, time);
    System.out.println("Simple interest: " + simpleInterest);
  }

  public static double calculateSimpleInterest(double principal, double rate, int time) 
  {
    return (principal * rate * time) / 100;
  }
}