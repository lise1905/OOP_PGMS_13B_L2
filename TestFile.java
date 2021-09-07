import java.io.*;
import java.util.Scanner;

class TestFile
{
	public static void main(String args[])
	{
		File f1=new File("D:\\JAVA\\labcycle 2\\qtn10");
		if(f1.isDirectory())
		{
			System.out.println("DETAILS: "+f1.getAbsolutePath());
			String s[]=f1.list();
			System.out.println("Total no.of files: "+s.length);
			for(int i=0;i<s.length;i++)
			{
				File f2=new File("D:\\JAVA\\labcycle 2\\qtn10"+"//"+s[i]);
				if(f2.isDirectory())
				{
					System.out.println(s[i]+"\t is a directory");
				}
				else
				{
					System.out.println(s[i]+"\t is a file");
				}
			}
		}
	   else
	   {
		   System.out.println("D:\\JAVA\\labcycle 2\\qtn10" + " is not a directory");
	   }
System.out.println("enter a file name to search: ");
Scanner sc=new Scanner(System.in);
String fname=sc.nextLine();
String filelist[]=f1.list();
boolean f=false;
	for(int i=0;i<filelist.length;i++)
	{
		File f2=new File("D:\\JAVA\\labcycle 2\\qtn10"+"//"+filelist[i]);
		if(fname.equals(f2.getName()))
		{
		  System.out.println(fname+"file found");
		  f=true;
		  break;
		}
	}
	if(!f)
	{
		System.out.println("file doesn't exists");
	}
	
	}
}