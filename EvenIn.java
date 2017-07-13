import java.util.*;
import java.io.*;
class Prime
{
	public static void main(String args[])
	{
		int a,b,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the intervals");
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(" "+i);
			}
		}
		
	}
}
