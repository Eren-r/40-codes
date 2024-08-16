public class char_array_string 
{

  public static void main(String[] args) 
  {
    char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    String string = convertCharArrayToString(charArray);
    System.out.println("String: " + string);
  }

  public static String convertCharArrayToString(char[] charArray) 
  {
    return new String(charArray);
  }
}