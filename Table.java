import java.util.*;
import java.io.*;
class Table
{
	public static void main(String args[])
	{
		int i,i1=1,i2,range;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		range=s.nextInt();
		System.out.println("Which table you want");
		i2=s.nextInt();
		for(i=1;i<=range;i++)
		{
			System.out.print(i1+"*"+i2+"="+i1*i2);
			System.out.println(" ");
			i1++;
		}
	}
}