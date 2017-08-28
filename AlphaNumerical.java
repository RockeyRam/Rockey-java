import java.util.*;
import java.io.*;
class AlphaNumerical
{
  String a;
  char c;
  int acount=0,bcount=0,i,;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the String");
  System.out.println("The alpha numerical is"+a.length());
  c=str.toCharArray();
  for(i=0;i<a.length;i++)
  {
    if(Character.isDigit(c[i]))
    {
      acount=acount+1;
    }
    else
    {
      bcount=bcount+1;
    }
  }
  System.out.println("The total number of Numerical Value is "+acount);
  System.out.println("The total number of Alphabet value is "+bcount);
}
