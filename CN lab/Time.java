import java.util.*;
import java.net.*;
import java.text.*;
import java.io.*;
class Time{
public static void main(String[] args)throws Exception{
		ServerSocket s=new ServerSocket(1234);
		Socket ss=s.accept();
		DataInputStream Din=new DataInputStream(ss.getInputStream());
		DataOutputStream Dout=new DataOutputStream(ss.getOutputStream());
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count ");
		int n=sc.nextInt();
		//String s1=n+"";
		Dout.write(n);
		String input="";
		
		for(int i=0;i<n;i++)
		{
		System.out.println("enter the msg");
		input=sc.next();   
		Dout.writeUTF(input);	
		System.out.println(i+"is send");
		int c=Din.read();
		System.out.println("ack for"+c+"received");
		}
	}
}

/*	DatagramSocket s1=new DatagramSocket();
	DatagramSocket s=new DatagramSocket(1245);
	String[] ip={"12.3","3.5","9.2"};
	String[] site={"google","facebook","whatsapp"};
	InetAddress in=InetAddress.getLocalHost();
	byte buf[]=new byte[2000],buf1[]=new byte[2000];
	String inp="";
	DatagramPacket dp=null;
	dp=new DatagramPacket(buf,buf.length);	
	s.receive(dp);
	String si=new String(dp.getData());
	si=si.trim();
	System.out.println("site"+si);
	for(int i=0;i<3;i++)
	{
		if(si.equals(site[i]))
			inp=ip[i];
	}
	System.out.println("ip"+inp);
	buf=inp.getBytes();
	DatagramPacket dp1=new DatagramPacket(buf,buf.length,in,1235);
	s1.send(dp1);
}
} */
/*  
DatagramSocket socket=new DatagramSocket();
	InetAddress add=InetAddress.getByName("localhost");
	int port=5252;
	byte buf[]={12,13};
	byte buf1[]=new byte[2];
	DatagramPacket sen=new DatagramPacket(buf,2);
	DatagramPacket rece=new DatagramPacket(buf1,2);
	socket.connect(add,port);
	socket.send(sen);
	socket.receive(rece);
	System.out.println("recevied input:"+Arrays.toString(rece.getData()));
}		
}
	/*
	ServerSocket ss=new ServerSocket(12345);
	Socket s=ss.accept();
	DataInputStream din=new DataInputStream(s.getInputStream());
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	//Date d=new Date();
	//DateFormat df=new SimpleDateFormat("dd-mm-yyyy");
	String str1="",str2="";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the measage");
	while(!str1.equals("bye"))
	{
		System.out.println("msg:");
		str2=sc.nextLine();		
		dout.writeUTF(str2);
		dout.flush();
		str1=din.readUTF();
		System.out.println("echo client:"+str1);
	}
	din.close();
	s.close();
	ss.close();
	} 
	
	*/ 