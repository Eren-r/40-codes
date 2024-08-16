public class count_vowel_consonent 
{

  public static void main(String[] args) 
  {
    String str = "hello world";
    countVowelsAndConsonants(str);
  }

  public static void countVowelsAndConsonants(String str) 
  {
    int vowelCount = 0;
    int consonantCount = 0;
    str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
    for (int i = 0; i < str.length(); i++) 
    {
      char ch = str.charAt(i);
      if (Character.isLetter(ch)) 
      {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          vowelCount++;
        } 
        else 
        {
          consonantCount++;
        }
      }
    }
    System.out.println("Vowel count: " + vowelCount);
    System.out.println("Consonant count: " + consonantCount);
  }
}