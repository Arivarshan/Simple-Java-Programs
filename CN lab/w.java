import java.io.*;
import java.text.*;
import java.net.*;
import java.util.*;
public class w{
	public static void main(String args[])throws Exception
	{
		ServerSocket s=new ServerSocket(1234);
		Socket ss=s.accept();
		File f=new File("s.txt");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
		byte b[]=new byte[(int)f.length()];
		while(true)
		{
			bis.read(b,0,b.length);
			OutputStream op=ss.getOutputStream();
			op.write(b,0,b.length);
			op.flush();
			ss.close();
		}
	}
}