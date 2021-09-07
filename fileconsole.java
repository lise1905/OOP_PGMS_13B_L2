import java.io.*;
import java.util.Scanner;
public class fileconsole
{
public static void main(String args[])throws IOException
{ 
	try 
	{
	FileWriter myWriter = new FileWriter("D:\\question11.txt");
	System.out.println("Enter your name:");
	Scanner sc= new Scanner(System.in);
	String str= sc.nextLine();
	System.out.println("\nEnter your age:");  
	int age=sc.nextInt();
	myWriter.write(str+"\n");
	myWriter.write(age+"\n");
	myWriter.close();
	System.out.println("Successfully wrote to the file.");
	String s;
	File f1=new File("D:\\question11.txt");
	FileReader fr=new FileReader(f1);
	BufferedReader br=new BufferedReader(fr);
	while((s=br.readLine()) !=null)
	{
	System.out.println("The content wrote in the file is:"+s);
	}
	fr.close();
	}
catch(IOException e)
{ 
System.out.println("An error occurred."); 
}
}
}