import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
public class DClient{
	public static void main(String args[])throws Exception{
		DatagramSocket d=new DatagramSocket(1234);
		byte buf[]=new byte[2];
		byte buf1[]={14,13};
		DatagramPacket din1=new DatagramPacket(buf,2);
		d.receive(din1);
		DatagramPacket dout=new DatagramPacket(buf1,2,din1.getAddress(),din1.getPort());
		d.send(dout);
		System.out.println(""+Arrays.toString(din1.getData()));
	}
}