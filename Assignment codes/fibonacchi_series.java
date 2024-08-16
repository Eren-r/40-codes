public class fibonacchi_series 
{

  public static void main(String[] args) 
  {
    int n = 10;

    System.out.println("Fibonacci series up to " + n + " numbers:");
    printFibonacciSeries(n);
  }

  public static void printFibonacciSeries(int n) 
  {
    if (n <= 0) 
    {
      return; // Handle invalid input
    }
    int a = 0;
    int b = 1;
    System.out.print(a + " ");
    if (n > 1) 
    {
      System.out.print(b + " ");
    }
    for (int i = 2; i < n; i++) 
    {
      int c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
  }
}