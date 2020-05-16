import java.util.*;
import java.io.*;
import java.text.*;
import java.net.*;
public class CRC{
	public static void main(String args[]){
	int i=0,j=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("divident");
	String n=sc.nextLine();
	System.out.println("divisor");
	String d=sc.nextLine();
	int[] dn=new int[n.length()+d.length()-1];
	int[] di=new int[d.length()];
	for(i=0;i<n.length();i++)
		dn[i]=Integer.parseInt(n.charAt(i)+"");
	for(j=0;j<d.length();j++)
		di[j]=Integer.parseInt(d.charAt(j)+"");
	for(i=0;i<dn.length;i++)
	{
		if(dn[i]==1)
		{
			for(j=0;j<di.length;j++)
			{	//int h=di[j];
				dn[i+j]=di[j];
			}
		}
	}
	System.out.println("crc:");
	for(j=0;j<d.length();j++)
		dn[i]=Integer.parseInt(n.charAt(i)+"");
	for(j=0;j<di.length;j++)
		System.out.print(di[j]);
	}
}