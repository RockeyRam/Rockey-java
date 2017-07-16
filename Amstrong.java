import java.util.*;
import java.io.*;
import java.lang.*;
class Amstrong
{
public static void main(String args[])
{	
	int n,i,am=0,d,no;
	System.out.println("Enter the number");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	no=n;
	while(n!=0)
	{
		
		d=n%10;
		am=am+(d*d*d);
		n=n/10;
	}
	if(no==am)
	{
		System.out.println("The given number is Amstrong Number");
	}
	else
	{
		System.out.println("The given number is Not Amstrong Number");
	}
}
}