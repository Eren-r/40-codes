public class add_element_array 
{

  public static void main(String[] args) 
  {
    int[] numbers = {1, 2, 3, 4, 5};
    int newElement = 6;
    numbers = addElement(numbers, newElement);
    for (int number : numbers) 
    {
      System.out.print(number + " ");
    }
  }

  public static int[] addElement(int[] array, int newElement) 
  {
    int[] newArray = new int[array.length + 1];
    for (int i = 0; i < array.length; i++) 
    {
      newArray[i] = array[i];
    }
    newArray[array.length] = newElement;
    return newArray;
  }
}