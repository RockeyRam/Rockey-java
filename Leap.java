import java.util.*;
import java.io.*;
class Leap
{
	public static void main(String args[])
	{
		int a;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if((a%400)==0)
		{
			System.out.println("This is a Leap Year");
		}
		else
		{
			System.out.println("This is not a leap year");
		}
	}
}