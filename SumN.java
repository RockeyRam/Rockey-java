import java.util.*;
import java.io.*;
class SumN
{
	public static void main(String args[])
	{
		int n,count=0,i,j=1;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			count=count+j;
			j++;
		}
		System.out.println(" "+count);
	}
}
