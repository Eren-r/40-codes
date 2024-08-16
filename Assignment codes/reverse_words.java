public class reverse_words 
{

  public static void main(String[] args) 
  {
    String str = "This is a sentence";
    String reversedString = reverseWords(str);
    System.out.println("Reversed String: " + reversedString);
  }

  public static String reverseWords(String str) 
  {
    String[] words = str.split(" ");
    StringBuilder reversedString = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) 
    {
      reversedString.append(words[i]).append(" ");
    }
    return reversedString.toString().trim();
  }
}