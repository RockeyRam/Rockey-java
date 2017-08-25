import java.io.*;
import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		int a=0,b=1,i,range,fib=0;
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);
		range=s.nextInt();
		while(fib<range-2)
		{
				fib=a+b;
				a=a+1;
				b=b+1;			
		}
		System.out.println(fib);
	}

}