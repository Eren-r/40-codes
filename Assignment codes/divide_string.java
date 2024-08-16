public class divide_string 
{

  public static void main(String[] args) 
  {
    String str = "HelloWorld";
    int n = 3;
    String[] parts = divideString(str, n);
    for (String part : parts) 
    {
      System.out.println(part);
    }
  }

  public static String[] divideString(String str, int n) 
  {
    int len = str.length();
    int partLen = len / n;
    int remainder = len % n;
    String[] parts = new String[n];
    int startIndex = 0;
    for (int i = 0; i < n; i++) 
    {
      int endIndex = startIndex + partLen;
      if (remainder > 0) {
        endIndex++;
        remainder--;
      }
      parts[i] = str.substring(startIndex, endIndex);
      startIndex = endIndex;
    }
    return parts;
  }
}