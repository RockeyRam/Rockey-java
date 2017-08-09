import java.util.*;

import java.lang.*;

import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */

class Fact

{
	public static void main (String[] args) throws java.lang.Exception
	
	{
		// your code goes here
		
		int n,i,fact=1;
	    
		System.out.println("Enter the Number");
	   
		 Scanner s=new Scanner(System.in);
	    
		n=s.nextInt();
	    
		if(n>0)
	       
		 {
	           
			 for(i=1;i<=n;++i)
	           
			 {
	              
				   fact=fact*i;
	            
			}
	            
			 System.out.println(fact);
	       
		 }
	       
		else
	      
		 {
	          
			 System.out.println("Error");
	       
		}
	
	}

}