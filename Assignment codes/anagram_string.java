public class anagram_string 
{

  public static void main(String[] args) 
  {
    String str1 = "listen";
    String str2 = "silent";
    if (areAnagrams(str1, str2)) 
    {
      System.out.println(str1 + " and " + str2 + " are anagrams.");
    } 
    else 
    {
      System.out.println(str1 + " and " + str2 + " are not anagrams.");
    }
  }

  public static boolean areAnagrams(String str1, String str2) 
  {
    if (str1.length() != str2.length()) 
    {
      return false;
    }
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    int[] charCount = new int[256]; // Assuming ASCII characters
    for (int i = 0; i < str1.length(); i++) 
    {
      charCount[str1.charAt(i)]++;
    }
    for (int i = 0; i < str2.length(); i++) 
    {
      charCount[str2.charAt(i)]--;
      if (charCount[str2.charAt(i)] < 0) 
      {
        return false;
      }
    }
    return true;
  }
}