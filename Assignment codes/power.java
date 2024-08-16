import java.util.Scanner;

public class power 
{

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base number: ");
    int base = sc.nextInt();
    System.out.print("Enter the exponent: ");
    int exponent = sc.nextInt();

    int power = calculatePower(base, exponent);
    System.out.println(base + " raised to the power of " + exponent + " is: " + power);
  }

  public static int calculatePower(int base, int exponent)
  {
    if (exponent == 0) 
    {
      return 1;
    } 
    else 
    {
      int result = 1;
      for (int i = 0; i < exponent; i++) 
      {
        result *= base;
      }
      return result;
    }
  }
}