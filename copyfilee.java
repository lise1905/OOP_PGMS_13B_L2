import java.io.*;
class copyfilee
{
 public static void main(String args[])throws IOException, FileNotFoundException
  {
    int i;
     File f1=new File("D:\\java lab 2\\java\\old.txt");
     File f2=new File("D:\\java lab 2\\java\\new.txt");
     FileInputStream fin=new FileInputStream(f1);
     FileOutputStream fout=new FileOutputStream(f2);
     do
     {
      i=fin.read();
      if (i !=-1)
        fout.write(i);
     }while(i!=-1);
   System.out.println("The entire content of the file old is copied into the file new");
    fin.close();
     fout.close();
 }
}