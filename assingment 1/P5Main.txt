import java.util.*;
public class Pg5Main
{
public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the hour");
	int a=obj.nextInt();
	System.out.println("enter thr minute");
	int b=obj.nextInt();
	System.out.println("enter am/pm");
	String c=obj.next();
	time s=new time(a,b,c);
	s.rton();
	s.ntor();



}




}