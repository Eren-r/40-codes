public class average_using_array 
{

  public static void main(String[] args) 
  {
    int[] numbers = {1, 2, 3, 4, 5};
    double average = calculateAverage(numbers);
    System.out.println("Average of the numbers: " + average);
  }

  public static double calculateAverage(int[] numbers) 
  {
    if (numbers.length == 0) 
    {
      return 0.0; // Handle empty array
    }
    int sum = 0;
    for (int number : numbers) 
    {
      sum += number;
    }
    return (double) sum / numbers.length;
  }
}