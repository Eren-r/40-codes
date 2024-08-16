public class occurance 
{

  public static void main(String[] args) 
  {
    String str = "hello";
    findCharacterOccurrences(str);
  }

  public static void findCharacterOccurrences(String str) 
  {
    System.out.println("Character occurrences in " + str + " are:");
    int[] charCount = new int[256];
    for (int i = 0; i < str.length(); i++) 
    {
      charCount[str.charAt(i)]++;
    }
    for (int i = 0; i < 256; i++) 
    {
      if (charCount[i] > 0) 
      {
        System.out.println((char) i + ": " + charCount[i]);
      }
    }
  }
}