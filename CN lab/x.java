import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
public class x
{
public static void main(String args[])throws Exception
{	
	Socket s=new Socket("localhost",12345);
	byte b[]=new byte[2018];
	InputStream in=s.getInputStream();
	FileOutputStream fos=new FileOutputStream("s1.txt");
	BufferedOutputStream bis=new BufferedOutputStream(fos);
	int r=in.read(b,0,b.length);
	bis.write(b,0,r);
	bis.close();
	s.close();
}
}