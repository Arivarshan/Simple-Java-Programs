import java.util.*;
public class game
{
public static void main(String atgs[])
	{
		String s="stone";
		String p="papaer";
		String sc=scissor;
		System.out.println("enter the first player's choice");
		Scanner obj=new scanner(System.in);
		game p1=obj.next();
		Sysytem.out.println("enter the second player's choice");
		game p2=obj.next();
		if(p1.equals(p2))
			Sysytem.out.println("match  was draw");
		else if((s.equals(p1)&&p.equals(p2))||(p.equals(p1)&&sc.equals(p2))||(sc.equals(p1)&&s.equals(p2)))
			System.out.println("player1 was win");
		else if((s.equals(p1)&&sc.equals(p2))||(p.equals(p1)&&s.equals(p2))||(sc.equals(p1)&&p.equals(p2)))
			System.out.println("player2 was win");
	}
}