import java.util.*;
import java.io.*;
import java.lang.*;
class Power
{
	public static void main(String args[])
	{
		int n,p;
		double result;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter the powr of the number");
		p=s.nextInt();
		result=Math.pow(n,p);
		System.out.println(result);
	}
}