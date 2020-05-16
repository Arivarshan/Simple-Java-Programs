public class Pg2
{
public static void baffle(String blimp)
	{
		System.out.println(blimp);
		zippo("ping",-5);
	}
public static void zippo(String quince,int flag)
{
	if (flag<0)
		{
 			System.out.println(quince+"zoop");
		}
	else
		{
			 System.out.println("ik");
			 baffle(quince); 
			 System.out.println("boo-wa-ha-ha");
		}
}
public static void main(String[] args)
		{
			zippo("rattle",13);
		}

}


            // OUTPUT //
/*
	D:\java\assigment2>javac buzz.java

	D:\java\assigment2>java buzz	
	ik
	rattle
	pingzoop
	boo-wa-ha-ha 
*/