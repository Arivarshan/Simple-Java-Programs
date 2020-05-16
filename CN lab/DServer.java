import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
public class DServer{
	public static void main(String args[])throws Exception{
	DatagramSocket Socket=new DatagramSocket();
	InetAddress add=InetAddress.getByName("localhost");
	int port=1234;
	byte buf[]=new byte[2];
	byte buf1[]={45,55};
	DatagramPacket din=new DatagramPacket(buf,2);
	DatagramPacket dout=new DatagramPacket(buf1,2,add,port);
	Socket.connect(add,port);
	Socket.send(dout);
	Socket.receive(din);
	System.out.println(""+Arrays.toString(din.getData()));
	}
}