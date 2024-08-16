import java.util.Scanner;

public class calculator_adv
 {
	
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
	System.out.println("Choose your operation :\n 1) For Addition\n 2) For Subtraction\n 3) For Multiplication\n 4) For Division\n 5) For CGPA\n 6) For Percentage");
	int z = sc.nextInt();
	if(z==1)
	{	
		System.out.print("* Addition * \n ");
		System.out.print("Enter the first number: ");
       		 int a = sc.nextInt();
       		 System.out.print("Enter the second number: ");
        	int b = sc.nextInt();
       		 int c = a + b;
       		 System.out.println("Your addition is: " + c + "\n");
	}
	else if(z==2)
	{
		System.out.print("* Subtraction * \n ");
		System.out.print("Enter the first number: ");
       		 int d = sc.nextInt();
       		 System.out.print("Enter the second number: ");
       		 int e = sc.nextInt();
       		 int f = d - e;
       		 System.out.println("Your subtraction is: " + f + "\n");
	}
	else if(z==3)
	{
		System.out.print("* Multiplication * \n ");
		System.out.print("Enter the first number: ");
         	 int g = sc.nextInt();
        	System.out.print("Enter the second number: ");
        	int h = sc.nextInt();
        	int i = g * h;
        	System.out.println("Your multiplication is: " + i + "\n");
	}
	else if(z==4)
	{
		System.out.print("* Division * \n");
		System.out.print("Enter the first number: ");
         	 double j = sc.nextDouble();
        	System.out.print("Enter the second number: ");
        	double k = sc.nextDouble();
        	double l = j / k;
        	System.out.println("Your multiplication is: " + l + "\n");
	}
	else if(z==5)
	{
		float total = 0;
   	 	System.out.println("* CGPA  * \n");
   	 	System.out.print("Enter marks of subject 1 : ");
   		 float s1 = sc.nextFloat();
   		 total = total + s1;
   	 	System.out.print("Enter marks of subject 2 : ");
   		 float s2 = sc.nextFloat();
   		 total = total + s2;
   		 System.out.print("Enter marks of subject 3 : ");
   		 float s3 = sc.nextFloat();
  	 	 total = total + s3;
  	 	 System.out.print("Enter marks of subject 4 : ");
  	 	 float s4 = sc.nextFloat();
   	 	total = total + s4;
   		 System.out.print("Enter marks of subject 5 : ");
   		 float s5 = sc.nextFloat();
   		 total = total + s5;
   		 float GT = (total/50);
    		System.out.println("Your CGPA is : " + GT);
	}
	else if(z==6)
	{
		    float total = 0;
		 System.out.print("* Percentage * \n");
   		 System.out.print("Enter total mark of the subject (Eg: 100, 80): ");
   		 int total_mark = sc.nextInt();
   		 System.out.print("Enter marks of subject 1 : ");
   		 float s1 = sc.nextFloat();
   		 total = total + s1;
   		 System.out.print("Enter marks of subject 2 : ");
   		 float s2 = sc.nextFloat();
   		 total = total + s2;
    		System.out.print("Enter marks of subject 3 : ");
    		float s3 = sc.nextFloat();
    		total = total + s3;
    		System.out.print("Enter marks of subject 4 : ");
    		float s4 = sc.nextFloat();
   		 total = total + s4;
   		 System.out.print("Enter marks of subject 5 : ");
    		float s5 = sc.nextFloat();
    		total = total + s5;
    		float GT = total * 100/(total_mark*5);
    		System.out.println("Yoy got : " + GT + " %");
	}
        
        System.out.println("* Thank you for using our calculator *");
   }
}