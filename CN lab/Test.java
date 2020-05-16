import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
public class  Test{
	public static void main(String args[])throws Exception{
		String host="www.google.com";
		int port=80;
		try{
		   Socket s=new Socket(host,port);
		   PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		   BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		   //out.println("www.google.com");
		   String inputLine;
		   while((inputLine=in.readLine())!=null)
			{
				System.out.println(inputLine);
			}
		}catch(UnknownHostException c)
			{
				//System.err.println(c+"hello");
				System.out.println("dont know about the host "+host);
				System.exit(1);
			}
		 catch(IOException e)
		{
			System.err.println("cannot conect");
			System.exit(1);
		}
	}
}