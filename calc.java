import java.util.Scanner;
import java.lang.Math;

public class calc
{
	public static void main(String args[])
	{
		int num1,num2,ch;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.print("1.Addition\n2.Substraction\n3.Multiply\n4.Divide\n5.sin\n6.cos\n7.tan\n8.Quit\nEnter Ur Choice-:");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter 1st Number-:");
				num1=sc.nextInt();
				System.out.println("Enter 2nd Number-:");
				num2=sc.nextInt();
				int result=num1+num2;
				System.out.println("Result is: "+result);
				break;
			case 2:
				System.out.println("Enter 1st Number-:");
				num1=sc.nextInt();
				System.out.println("Enter 2nd Number-:");
				num2=sc.nextInt();
				result=num1-num2;
				System.out.println("Result is: "+result);
				break;
			case 3:
				System.out.println("Enter 1st Number-:");
				num1=sc.nextInt();
				System.out.println("Enter 2nd Number-:");
				num2=sc.nextInt();
				result=num1*num2;
				System.out.println("Result is: "+result);
				break;
			case 4:
				System.out.println("Enter 1st Number-:");
				num1=sc.nextInt();
				System.out.println("Enter 2nd Number-:");
				num2=sc.nextInt();
				result=num1/num2;
				System.out.println("Result is: "+result);
				break;
			case 5:
				System.out.println("Enter Number-:");
				num1=sc.nextInt();
				double result1=Math.sin(Math.toRadians(num1));
				System.out.println("Result is-: "+result1);
				break;
			case 6:
				System.out.println("Enter Number-:");
				num1=sc.nextInt();
				result1=Math.cos(Math.toRadians(num1));
				System.out.println("Result is-: "+result1);
				break;
			case 7:
				System.out.println("Enter Number-:");
				num1=sc.nextInt();
				result1=Math.tan(Math.toRadians(num1));
				System.out.println("Result is-: "+result1);
				break;
			}
		}while(ch!=8);
	}
}
