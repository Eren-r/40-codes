import java.util.Scanner;

public class intrest 
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
    System.out.print("Enter the number of times interest is compounded per year: ");
    int n = sc.nextInt();

    double compoundInterest = calculateCompoundInterest(principal, rate, time, n);
    System.out.println("Compound interest: " + compoundInterest);
  }

  public static double calculateCompoundInterest(double principal, double rate, int time, int n) 
  {
    double amount = principal * Math.pow(1 + (rate / (n * 100)), (n * time));
    return amount - principal;
  }
}