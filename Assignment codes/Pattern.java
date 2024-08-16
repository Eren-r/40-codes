public class Pattern 
{
    public static void main(String[] args) 
    {
        String[] pattern = 
        {
            "E E E E E   R R R R   E E E E E   N       N",
            "E           R     R   E           N N     N",
            "E E E E     R R R R   E E E E     N   N   N",
            "E           R R       E           N     N N",
            "E E E E E   R   R     E E E E E   N       N"
        };

        for (String line : pattern) 
        {
            System.out.println(line);
        }
    }
}