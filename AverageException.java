import java.io.*;
import java.util.Scanner;

class AverageException
{
	int l;
	float avg,n,sum=0;
	void read()throws NegativeException
	{
	   Scanner sc = new Scanner(System.in);     
       System.out.println("Enter limit: ");  
       l = sc.nextInt(); 
       for(int i=1;i<=l;i++)
	   {
		   if(n<0)throw new NegativeException();
		   else
		   {
			   System.out.println("Enter Number" +i);
			   n = sc.nextInt();
			   sum=sum+n;
		   }
	   }
	     avg=sum/l;
		 System.out.println("Average: "+avg);
	}
	public static void main(String args[])
	{
		AverageException ob1= new AverageException();
		try
		{
			ob1.read();
		}
		catch(NegativeException e)
		{
			e.show();
		}
		
	}
}

class NegativeException extends Exception
{
  void show()
  {
		System.out.println("please enter a positive number");
  }
}

		   