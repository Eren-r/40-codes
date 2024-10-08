public class alphabet_diamond_pattern 
{

  public static void main(String[] args) 
  {
    int n = 5;

    // Alphabet pattern
    printAlphabetPattern(n);

    // Diamond pattern
    printDiamondPattern(n);
  }

  public static void printAlphabetPattern(int n) 
  {
    for (int i = 0; i < n; i++) 
    {
      for (int j = 0; j <= i; j++) 
      {
        System.out.print((char) ('A' + j) + " ");
      }
      System.out.println();
    }
  }

  public static void printDiamondPattern(int n) 
  {
    // Upper half of the diamond
    for (int i = 1; i <= n; i++) 
    {
      for (int j = 1; j <= n - i; j++) 
      {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) 
      {
        System.out.print("*");
      }
      System.out.println();
    }

    // Lower half of the diamond
    for (int i = n - 1; i >= 1; i--) 
    {
      for (int j = 1; j <= n - i; j++) 
      {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) 
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}