public class white_spaces 
{

  public static void main(String[] args) 
  {
    String str = "This is a string with spaces";
    String stringWithoutSpaces = removeSpaces(str);
    System.out.println("String without spaces: " + stringWithoutSpaces);
  }

  public static String removeSpaces(String str) 
  {
    return str.replaceAll("\\s+", "");
  }
