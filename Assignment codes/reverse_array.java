public class reverse_array 
{

  public static void main(String[] args) 
  {
    int[] numbers = {1, 2, 3, 4, 5};
    reverseArray(numbers);
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }

  public static void reverseArray(int[] array) 
  {
    int n = array.length;
    for (int i = 0; i < n / 2; i++) 
    {
      int temp = array[i];
      array[i] = array[n - i - 1];
      array[n - i - 1] = temp;
    }
  }
}