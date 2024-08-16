import java.util.Scanner;

class odd_even
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println("no is even ");
		}
		else
		{
			System.out.println("no is odd ");
		}
	}
}
