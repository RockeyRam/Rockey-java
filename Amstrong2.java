import java.util.*;
import java.io.*;
class Amstrong2
{
	public static void main(String args[])
	{
		int i1,i2,d,am=0,no;
		System.out.println("Enter the Intervals");
		Scanner s=new Scanner(System.in);
		i1=s.nextInt();
		i2=s.nextInt();
		while(i1<=i2)
		{
			 d=0;
			am=0;
			no=i1;	
			while(no!=0)
			{
				d=no%10;
				am=am+(d*d*d);
				no=no/10;
			}
			if(i1==am){
				System.out.println("Number"+am+"Is a Amstrong Number");}
			else{
				System.out.println("Number"+i1+"Is not a Amstrong Number");}
			
		i1++;	
		}

	}
}