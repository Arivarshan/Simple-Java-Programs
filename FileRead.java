//write ajava prgorm to read the contents of a file and print it in the console 
import java.io.*;
import java.util.*;
public class FileRead
{
public static void main(String a[])
	{
	try{
		File f=new File(a[0]);
		File f1=new File(a[1]);
		FileReader fr=new FileReader(f);
		FileReader fr1=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr1);
		BufferedReader br1=new BufferedReader(fr);
		String str;
		ArrayList<String> a1=new ArrayList();
 		while((str=br.readLine())!=null)
		{
 		 if(!a1.contains(str))
		 {
		  a1.add(str);
		 }
		}
		while((str=br1.readLine())!=null)
		{
 		 if(!a1.contains(str))
		 {
		  System.out.println(str);
		 }
		}
	   }catch(Exception e){System.out.println("File not found");}

	}

}