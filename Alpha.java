import java.io.*;
import java.util.*;
class Alpha
{
	public static void main(String args[])
	{
		char var;
		System.out.println("Enter your Input");
		Scanner s=new Scanner(System.in);
		var=s.next().charAt(0);
		if(var>='a'&&var<='z'||var>='A'&&var<='Z')
		{
			System.out.println("The input is Alphabet");
		}
		else
		{
			System.out.println("This is not Alphabet");
		}
	}
}