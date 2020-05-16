import java.io.*;
import java.util.*;
import java.net.*;
import java.text.*;
public class y{
	public static void main(String args[])throws Exception
	{
		ServerSocket s=new ServerSocket(12345);
		Socket ss=s.accept();
		File f=new File("S.txt");
		byte b[]=new byte[(int)f.length()];
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
		while(true)
		{
			bis.read(b,0,b.length);
			OutputStream os=ss.getOutputStream();
			os.write(b,0,b.length);
			os.flush ();
			ss.close();
			break;
		}
	}
}