import java.util.*;
public class OddorEven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ënter the number");
int a=sc.nextInt();
while(1)
{
switch(a)
{
	case 0:
			System.oout.println("give a valid number");
	case 1:
			PosOdd(a);
			break;

	case 2:
			PosEven(a);
			break;


}

}
void PosOdd(int a);
	{
	while(a%2!=0)
	{
		if(a>0)
		{
			System.out.println("given is aodd positive integer");
		}
		else
		{
			System.out.println("given is an odd negative integer");
		}
	}

}
}

}