import java.io.*;
import java.util.*;
class Reverse
{
  public static void main(String args[])
  {
    int n,t,rem,rev=0;
    System.out.println("Enter the Number");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    t=n;
    while(n>0)
    {
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
    }
    System.out.println("The reverse number is"+rev);
  }
}
