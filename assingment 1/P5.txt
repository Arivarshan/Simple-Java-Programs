public class Pg5
{
int h,m;
String d;
time(int h,int m,String d)
{
	this.h=h;
	this.m=m;
	this.d=d;
}
public void rton()
{
	System.out.println("in 12 hour formate");
	if(h>12)
	{
		System.out.println((h-12)+":"+m+d);
	}
	else
	{	
		System.out.println(h+":"+m+d);
}	}
public void ntor()
{	
	System.out.println("in 24 hour formate");
	if(d.equals("pm")&&h<12)
		System.out.println((12+h)+":"+m+d);
	else if(h>12)
		System.out.println(h+":"+m+d);
	else if(h==12)
		System.out.println("00""+":"+m+d);
}
}