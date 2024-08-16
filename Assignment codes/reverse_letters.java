public class reverse_letters 
{

  public static void main(String[] args) 
  {
    String str = "Hello world";
    String reversedString = reverseLetters(str);
    System.out.println("Reversed string: " + reversedString);
  }

  public static String reverseLetters(String str) 
  {
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) 
    {
      char ch = str.charAt(i);
      if (Character.isLetter(ch)) 
      {
        sb.append(ch);
      }
    }
    return sb.toString();
  }
}