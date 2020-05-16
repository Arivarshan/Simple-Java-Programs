import java.util.*;
import java.net.*;
import java.text.*;
import java.io.*;
public class test1{
	public static void main(String args[])throws Exception{
	try{		
	String host="www.google.com";
	int port=80;	
	Socket s=new Socket(host,port);
	PrintWriter p=new PrintWriter(s.getOutputStream(),true);
	BufferedReader b=new BufferedReader(new InputStreamReader(s.getInputStream()));
	p.println("www.google.com");
	String in=" ";
	while((in=b.readLine())!=null)
		{
			System.out.println(in);
		}
	}catch(UnknownHostException e){System.out.println(e);}
	}
}