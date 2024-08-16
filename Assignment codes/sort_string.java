import java.util.Arrays;

public class sort_string 
{

  public static void main(String[] args) 
  {
    String str = "hello";
    String sortedString = sortStringAlphabetically(str);
    System.out.println("Sorted String: " + sortedString);
  }

  public static String sortStringAlphabetically(String str) 
  {
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);
    return new String(charArray);
  }
}