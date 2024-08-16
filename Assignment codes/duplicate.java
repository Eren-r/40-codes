public class duplicate 
{

  public static void main(String[] args) 
  {
    String str = "Programming";
    findDuplicateCharacters(str);
  }

  public static void findDuplicateCharacters(String str) 
  {
    System.out.println("Duplicate characters in " + str + " are:");
    int[] charCount = new int[256]; 
    for (int i = 0; i < str.length(); i++) 
    {
      charCount[str.charAt(i)]++;
    }
    for (int i = 0; i < 256; i++) 
    {
      if (charCount[i] > 1) 
      {
        System.out.print((char) i + " ");
      }
    }
    System.out.println();
  }
}