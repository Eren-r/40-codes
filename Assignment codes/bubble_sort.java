public class bubble_sort
{

  public static void main(String[] args) 
  {
    String str = "hello";
    String sortedString = bubbleSortString(str);
    System.out.println("Sorted String: " + sortedString);
  }

  public static String bubbleSortString(String str) 
  {
    char[] charArray = str.toCharArray();
    int n = charArray.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) 
      {
        if (charArray[j] > charArray[j + 1]) 
        {
          // Swap characters
          char temp = charArray[j];
          charArray[j] = charArray[j + 1];
          charArray[j + 1] = temp;
        }
      }
    }
    return new String(charArray);
  }
}