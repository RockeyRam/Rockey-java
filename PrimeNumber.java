import java.util.*;
import java.io.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		int n,i,count=0;
		System.out.println("Enter the Number ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
			System.out.println("The Number is Prime Number");
		}
		else
		{
			System.out.println("The Number is Not a PrimeNumber");
		}
	}
}