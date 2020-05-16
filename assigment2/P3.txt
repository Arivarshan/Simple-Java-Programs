public class Pg3
{
	public static void zoop(String fred,int bob)
		{
 		System.out.println(fred);
		if(bob==5)
			{ 
				ping("not");
			}
		else
			{
				System.out.println("!");
			}
		}
	
	public static void main(String[] args)
		{
			int bizz=5;
			int buzz=2;
			zoop("just for",bizz);
			clink(2*buzz);
		}
	public static void clink(int fork)
		{
			System.out.println("it's");
			zoop("breakfast",fork);
		}
	public static void ping(String strangStrung)
		{
			System.out.println("any" +strangStrung+ "more");
		}
}	



/*		OUTPUT
	D:\java\assigment2>javac Pg3.java

	D:\java\assigment2>java Pg3
	just for
	anynotmore
	it's
	breakfast
	!
*/