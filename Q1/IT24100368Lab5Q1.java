import java.util.Scanner;
public class IT24100368Lab5Q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number1,number2,number3,max,min;
		System.out.println("Enter the first integer:");
		number1=input.nextInt();
		System.out.println("Enter the second integer:");
		number2=input.nextInt();
		System.out.println("Enter the third integer:");
		number3=input.nextInt();
		System.out.println("User entered numbers are:" + number1+" "+number2+" "+number3+" ");
		if(number1>number2)
		{
			max=number1;
			min=number2;
		}
		else
		{
			max=number2;
			min=number3;
		}
		if(number3>max)
		{
			max=number3;
		}
		if(number3<min)
		{
			min=number3;
		}
		System.out.println("The samllest number is:"+min);
		System.out.println("The largest number is:"+max);
	}
}