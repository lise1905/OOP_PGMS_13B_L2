import java.io.*;
import java.util.Scanner;
public class oddeven 
{
public static void main(String args[])
{ 
int a[]=new int[5];
try 
{
FileWriter myWriter = new FileWriter("D:\\OodEven.txt");
FileWriter f2 = new FileWriter("D:\\Even.txt");
FileWriter f3 = new FileWriter("D:\\Odd.txt");
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 elements:");
for (int i=0; i<5; i++)
{
a[i]=sc.nextInt();
myWriter.write(a[i]+"\n");
}
myWriter.close();
System.out.println("Successfully wrote to the file");
String s;
File f1=new File("D:\\OodEven.txt");
FileReader fr=new FileReader(f1);
BufferedReader br=new BufferedReader(fr);
while((s=br.readLine()) !=null)
{	
int b=Integer.parseInt(s);
if(b%2==0)
{
f2.write(b+"\n");
}
else
{
f3.write(b+"\n");
}	
}
fr.close();
f2.close();
f3.close();
}
catch (IOException ex)
{ 
System.out.println("An error occurred."); 
}
}
}