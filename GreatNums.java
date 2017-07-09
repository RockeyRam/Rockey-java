import java.util.*;
import java.io.*;
class GreatNums
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter Three numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("The greatest number is "+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("The greatest number is "+b);
		}
		else if(c>a&&c>b)
		{
			System.out.println("The greatest number is "+c);
		}
	}
}