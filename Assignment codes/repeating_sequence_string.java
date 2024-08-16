public class repeating_sequence_string 
{

  public static void main(String[] args) 
  {
    String str = "abcabcbb";
    String longestRepeatingSequence = findLongestRepeatingSequence(str);
    System.out.println("Longest repeating sequence: " + longestRepeatingSequence);
  }

  public static String findLongestRepeatingSequence(String str) 
  {
    if (str.length() == 0) 
    {
      return "";
    }
    int n = str.length();
    int maxLength = 0;
    int startIndex = 0;
    for (int i = 0; i < n; i++) 
    {
      for (int j = i + 1; j < n; j++) 
      {
        if (str.charAt(i) == str.charAt(j)) 
        {
          int k = j + 1;
          while (k < n && str.charAt(i + k - j) == str.charAt(k)) 
          {
            k++;
          }
          if (k - j > maxLength) 
          {
            maxLength = k - j;
            startIndex = i;
          }
        }
      }
    }
    return str.substring(startIndex, startIndex + maxLength);
  }
}