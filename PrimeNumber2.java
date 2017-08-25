import java.util.*;
import java.io.*;
class PrimeNumber2
{
	public static void main(String args[])
	{
		int i,i1,i2,count;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Intervals");
		i1=s.nextInt();
		i2=s.nextInt();
		while(i1<=i2)
		{
			count=0;
			for(i=1;i<=i2;i++)
			{
				if(i1%i==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println("Number"+i1+"is Pime Number");
			}
			else
			{
				System.out.println("Number"+i1+"is not a Prime Number");
			}
			i1++;
		}
	}
}