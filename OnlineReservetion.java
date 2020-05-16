import java.util.*;
import java.io.*;
public class OnlineReservetion
{
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Alredy have an acccount (y/n)" );
	String s=sc.nextLine();
	s=s.toLowerCase();
	System.out.println(s);
	if(s.equals("y"))
	{
		System.out.println("Enter your UserName:");
		String s2=sc.nextLine();
		System.out.println("Enter your PassWord:");
		String s3=sc.nextLine();
		 

	}
	else if(s.equals("n"))
	{
		System.out.println("Enter your Name:");
		String name=sc.nextLine();	
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		System.out.println("Enter your Phonenumber:");
		String ph=sc.next();
		System.out.println("Enter your Password:");
		String password=sc.next();
		System.out.println("RE-Enter your Password:");
		String p1=sc.nextLine();
			//while(p1.equals(password))
				//System.out.println("account created successfully");
				
									

	}

}



} 