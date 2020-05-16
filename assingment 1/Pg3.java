import java.util.*;
public class Pg3
{
public static void main(String ar[])
{
int flag=0;
Scanner obj=new Scanner(System.in);
System.out.println("entre the number");
int a=obj.nextInt();
while(a>0)
{
for(int i=2;i<a;i++)
	if(a%i==0)
	{	
		flag=1;
	}
	break;
}
if(flag==1)
	System.out.println("given is not a prime number");
else if(flag==0)
	System.out.println("given is an prime number");
else
	System.out.println("give a valid input");
}




}