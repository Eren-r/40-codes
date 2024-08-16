public class char_str_converter 
{

  public static void main(String[] args) 
  {
    // Character to String
    char character = 'A';
    String stringFromCharacter = Character.toString(character);
    System.out.println("Character to String: " + stringFromCharacter);

    // String to Character
    String string = "B";
    char characterFromString = string.charAt(0);
    System.out.println("String to Character: " + characterFromString);
  }
}