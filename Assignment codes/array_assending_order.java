import java.util.Arrays;

public class array_assending_order 
{

  public static void main(String[] args) 
  {
    int[] numbers = {5, 2, 4, 1, 3};
    sortArrayAscending(numbers);
    for (int number : numbers) 
    {
      System.out.print(number + " ");
    }
  }

  public static void sortArrayAscending(int[] array) 
  {
    Arrays.sort(array);
  }
}