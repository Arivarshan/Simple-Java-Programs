import java.io.*;
import java.util.*;
import java.net.*;
import java.text.*;
public class Server{
	public static void main(String args[])throws Exception{
		ServerSocket ss=new ServerSocket(1234);
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		//Date d=new Date();
		//DateFormat df=new SimpleDateFormat("dd-mm-yyyy");
		String str="",str1="";
		Scanner sc=new Scanner(System.in);
		while(!str1.equals("bye"))
		{
		str=sc.nextLine();
		dout.writeUTF(str);
		//dout.flush();
		str1=din.readUTF();
		System.out.println("client:"+str1);
		}
	}
}