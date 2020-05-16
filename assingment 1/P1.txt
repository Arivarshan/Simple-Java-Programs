import java.util.*;
public class Pg1
{
	public static int t=0;
public static void main(String args[])
{	//int t=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
		if(n%2==0&&n<0)
			t=1;
		if(n%2==0&&n>0)
			t=2;
		if(n%2!=0&&n<0)
			t=3;
		if(n%2!=0&&n>0)
			t=4;
	switch(t)
	{
	case 1: System.out.println("negative even");
		break;
	case 2: System.out.println("positive even");
		break;
	case 3: System.out.println("negative odd");
		break;
	case 4: System.out.println("positive odd");
		break;

	}
}
}