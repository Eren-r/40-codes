import java.util.Scanner;

public class mul
{
	public static  void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first no: ");
		float a= sc.nextFloat();
		System.out.print("Enter a second no: ");
		float b = sc.nextFloat();
		float c = a * b;
		System.out.printf("Addition is: %.2f",  c);
	}

}