import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
class Tclient{
public static void main(String[] args)throws Exception{
	Socket s=new Socket("localhost",1234);
	DataInputStream Din=new DataInputStream(s.getInputStream());
	DataOutputStream Dout=new DataOutputStream(s.getOutputStream());
	int n;//=Integer.parseInt(Din.readUTF());
	n=Din.read();	
	String s1="";
	for(int i=0;i<n;i++)
	{
	DataInputStream Din1=new DataInputStream(s.getInputStream());
	s1=Din1.readUTF();
	System.out.println(""+s1);
	Dout.write(i);
	}
	}
}
/*	Scanner sc=new Scanner(System.in);	
	DatagramSocket s=new DatagramSocket();
	DatagramSocket s1=new DatagramSocket(1235);
	InetAddress in=InetAddress.getLocalHost();
	byte buf[]=new byte[2000],buf1[]=new byte[2000];
	System.out.println("enter ");
	String site=sc.nextLine();
	buf=site.getBytes();
	DatagramPacket dp1=null;
	dp1=new DatagramPacket(buf,buf.length,in,1245);
	s.send(dp1);
	DatagramPacket dp=new DatagramPacket(buf1,buf1.length);	
	s.receive(dp);
	String str=new String(dp.getData());
	System.out.println("ip address"+str.trim());
	}
} */
/*
	DatagramSocket socket=new DatagramSocket(5252);
	InetAddress add=InetAddress.getByName("localhost");
	int port=5252;
	byte buf[]=new byte[2];
	byte buf1[]={13,14};
	DatagramPacket dp=new DatagramPacket(buf,2);
	DatagramPacket sen=new DatagramPacket(buf1,2);
	socket.connect(add,port);
	socket.send(sen);
	socket.receive(dp);	
	System.out.println("recevied input:"+Arrays.toString(dp.getData()));
	}
}
	/*
	Socket s=new Socket("127.0.0.1",12345);
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	DataInputStream din=new DataInputStream(s.getInputStream());
	String str1="",str2="";
	Scanner sc=new Scanner(System.in);
	while(!str1.equals("bye"))
	{
	str1=din.readUTF();
	System.out.println("server:"+str1);
	//str2=sc.nextLine();
	dout.writeUTF(str1); 
	}	
	din.close();
	
	}
}
	*/