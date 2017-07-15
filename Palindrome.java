import java.io.*;
import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		int n,rev=0,rem,p=0;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		p=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(p==rev)
		{
			System.out.println("The given Number is a Palindrome");
		}
		else
		{
			System.out.println("The given number is not a Palindrom");
		}
	}
}	