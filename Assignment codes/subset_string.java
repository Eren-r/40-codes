import java.util.ArrayList;
import java.util.List;

public class subset_string 
{

  public static void main(String[] args) 
  {
    String str = "abc";
    List<String> subsets = findSubsets(str);
    System.out.println("Subsets of " + str + " are:");
    for (String subset : subsets) 
    {
      System.out.println(subset);
    }
  }

  public static List<String> findSubsets(String str) 
  {
    List<String> subsets = new ArrayList<>();
    int n = str.length();
    for (int i = 0; i < (1 << n); i++) 
    {
      StringBuilder subset = new StringBuilder();
      for (int j = 0; j < n; j++) 
      {
        if ((i & (1 << j)) != 0) 
        {
          subset.append(str.charAt(j));
        }
      }
      subsets.add(subset.toString());
    }
    return subsets;
  }
}