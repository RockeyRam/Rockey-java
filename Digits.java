import java.util.*;
import java.io.*;
class Digits
{
	public static void main(String args[])
	{
		int n,count=0;
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0)
		{
			n/=10;
			++count;
		}
		System.out.println(count);
	}
}