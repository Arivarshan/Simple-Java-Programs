import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;
public class Client{
	public static void main(String args[])throws Exception{
		Socket s=new Socket("localhost",1234);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		Scanner sc= new Scanner (System.in);
		String str="",str1="";
		while(!str.equals("bye"))
		{
		str=din.readUTF();
		//System.out.println("Server:"+str);
		//str1=sc.nextLine();
		dout.writeUTF(str);
	}
	}
}