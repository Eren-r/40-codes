import java.util.Scanner;

public class comparenumbers
{
    public static void main(String[] args)
 {
      	  Scanner sc = new Scanner(System.in);

               System.out.print("Enter the first number: ");
        	float num1 = sc.nextFloat();
       	      System.out.print("Enter the second number: ");
       		 float num2 = sc.nextFloat();
	      System.out.print("Enter a thirs number: ");
		 float num3 = sc.nextFloat();

               if (num1 > num2 && num1 > num3)
	 {
            System.out.println(num1 + "  is greater than " + num2 + " and " + num3);
        } 
	else if (num2 > num1 && num2 > num3) 
	{
            System.out.println(num2 + " is greater  than " + num1 + " and " + num3);
        } 
	else if( num3 > num1 && num3 > num2)
	{
            System.out.println(num3+ " is greater than " + num1 + " and " + num2);
        }
	else
	{
	    System.out.println(num1 + "," + num2 + " and "+ num3 +" are equal");
	}
    }
}
