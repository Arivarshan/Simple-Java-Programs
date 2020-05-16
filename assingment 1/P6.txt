import java.util.*;
class Rational
{
	int nr;
	int dr;

public Rational(int nr,int dr)
{
	this.nr=nr;
	this.dr=dr;
}
public void display()
{
	int t1=nr;
	int t2=dr;
	while(nr!=dr)
	{
		if(nr>dr)
		{
			nr=nr-dr;
		}
		else
			dr=dr-nr;
	}
	int nm=t1/nr;
	int dm=t2/dr;
	System.out.println(nm+"/"+dm);
}
}
public class Pg6
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Numaretor");
	int n=sc.nextInt();
	System.out.println("Enter the Denomenetor");
	int d=sc.nextInt();
	Rational a=new Rational(n,d);
	a.display();
}
}