import java.io.*;
import java.util.*;
import java.net.*;
import java.text.*;;
public class SR{
	public static void main(String rgs[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of frame" );
	int n=sc.nextInt();
	Boolean f=true;
	int count=0;
	while(f)
	{	
		for(int i=0;i<n;i++)
		{
		count++;
		System.out.println(count+"has been send");
		}	
		System.out.println("enter the negtive ack");
		int ack=sc.nextInt();
		if(ack==n)
		{
			break;
		}
		else
		{
			System.out.println(ack+"has been retransmit");
			f=false;
		}		
	}
	}
}