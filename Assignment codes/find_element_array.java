public class find_element_array 
{

  public static void main(String[] args) 
  {
    int[] array = {1, 2, 3, 4, 5};
    int numElements = countElements(array);
    System.out.println("Number of elements in the array: " + numElements);
  }

  public static int countElements(int[] array) 
  {
    return array.length;
  }
}