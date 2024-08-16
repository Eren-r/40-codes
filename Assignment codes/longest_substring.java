public class longest_substring 
{

  public static void main(String[] args) 
  {
    String str = "abcabcbb";
    String longestSubstring = findLongestSubstring(str);
    System.out.println("Longest substring without repeating characters: " + longestSubstring);
  }

  public static String findLongestSubstring(String str) 
  {
    if (str.length() == 0) 
    {
      return "";
    }
    int start = 0;
    int end = 0;
    int maxLength = 0;
    int[] charIndex = new int[256]; 
    Arrays.fill(charIndex, -1);
    for (int i = 0; i < str.length(); i++) 
    {
      char ch = str.charAt(i);
      if (charIndex[ch] != -1 && charIndex[ch] >= start) 
      {
        start = charIndex[ch] + 1;
      }
      charIndex[ch] = i;
      if (i - start + 1 > maxLength) 
      {
        maxLength = i - start + 1;
        end = i;
      }
    }
    return str.substring(start, end + 1);
  }
}