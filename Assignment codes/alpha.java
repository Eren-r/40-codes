import java.util.Scanner;

public class alpha 
{

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char ch = sc.next().charAt(0);

    if (isVowel(ch)) 
    {
      System.out.println(ch + " is a vowel.");
    } 
    else if (isConsonant(ch)) 
    {
      System.out.println(ch + " is a consonant.");
    } 
    else 
    {
      System.out.println(ch + " is not a vowel or a consonant.");
    }
  }

  public static boolean isVowel(char ch) 
  {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }

  public static boolean isConsonant(char ch) 
  {
    ch = Character.toLowerCase(ch);
    return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
  }
}