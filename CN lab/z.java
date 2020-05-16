import java.io.*;
import java.util.*;
import java.net.*;
import java.text.*;
public class z{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",1234);
		InputStream in=s.getInputStream();
		byte b[]=new byte[2018];
		FileOutputStream fos=new FileOutputStream("s1.txt");
		BufferedOutputStream bis=new BufferedOutputStream(fos);
		int r=in.read(b,0,b.length);
		bis.write(b,0,r);
		bis.close();
		s.close();
	}
}