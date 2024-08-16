public class Binary 
{
    public static void main(String[] args) 
    {
        String binary1 = "10101";
        String binary2 = "10001";

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int sum = num1 + num2;

        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of " + binary1 + " and " + binary2 + " is " + binarySum);
    }
}
