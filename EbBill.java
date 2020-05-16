import java.util.*;
class EbBill1
{
	String name,addres;
	int pmr,cmr,ch,unit;
	double amt;
	public EbBill1(String name,String addres,int pmr,int cmr,int ch)
	{
		this.name=name;
		this.addres=addres;
		this.pmr=pmr;
		this.cmr=cmr;
		this.ch=ch;
	}
	public void print()
	{
		System.out.println("***EbBill**");
		System.out.println("\nname		    :"+name);
		System.out.println("\naddres		    :"+addres);
		System.out.println("\nprevious month reading:"+pmr);
		System.out.println("\ncurrent month reading :"+cmr);
		if(ch==1)
		{
		if((unit=cmr-pmr)<100)
			amt=unit*1;
		else if(unit>=100&&unit<201)
			amt=unit*2.5;
		else if(unit<400)
			amt=unit*4;
		else
			amt=unit*6;
		}
		else
		{
		if((unit=cmr-pmr)<100)
			amt=unit*2;
		else if(unit>=100&&unit<201)
			amt=unit*4.5;
		else if(unit<400)
			amt=unit*6;
		else
			amt=unit*8;
		}
		System.out.println("amount"+amt);
	}	
}
public class EbBill
{
	public static void main(String args[])
	{
		String a,b;
		int c,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter your name");
		a=sc.next();
		System.out.println("\nenter your addres");
		b=sc.next();
		System.out.println("\nenter previos month reading");
		c=sc.nextInt();
		System.out.println("\nenter current month reading");
		d=sc.nextInt();
		System.out.println("\n1.domestic 2.indestry");
		e=sc.nextInt();
		EbBill1 bill=new EbBill1(a,b,c,d,e);
		bill.print();
	}
}