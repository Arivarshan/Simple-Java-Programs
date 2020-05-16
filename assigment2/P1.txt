import java.util .*;
class DateConversion
{ 
  String day;
  int date;
  int month;
  int year;
  String days[]={"","Januvary","Febraury","March","April","May","June","July","August","September","October","November","December"};	
  public void AF(int date,String day,int month,int year)
	{
		this.day=day;
		this.date=date;
		this.month=month;
		this.year=year;
		for(int i=0;i<13;i++)
		{  if(((date>31||date<=0)||(month>12||month<=0)))
			{	
				System.out.println("Invalid date or month please check it");
				break;
			}
 		   if(i==month)	
		 	   {
		  	   System.out.println("Americon Formet");
		  	   System.out.println( day+","+days[i]+" "+date+","+year);
		   	   break;
		  	   }
		}
	}
  public void EF(int date,int month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
		for(int i=0;i<12;i++)
		{  if(((date>31||date<=0)||(month>12||month<=0)))
			{			
				System.out.println("Invalid date or month please check it");
				break;
			}
 		
		   if(i==month)
			    {
				System.out.println("Europen Format");
				System.out.println(date+" " +days[i]+" "+year);																																																																																
				break;
		            }
		}
       	}
}
public class Pg1
{  
public static void main(String args[])
{	Scanner sc=new Scanner(System.in);
	System.out.println("entre the date");
	int dt=sc.nextInt();
	System.out.println("entre the day");
	String day=sc.next();
	System.out.println("entre the month");
	int mo=sc.nextInt();
	System.out.println("entre the year");
	int ye=sc.nextInt();
	System.out.println("Entre the coice");
 	System.out.println("1.American Formet");
	System.out.println("2.Europen Formet");
	int ch=sc.nextInt();
	DateConversion a=new DateConversion();
	if(ch==1)
	  a.AF(dt,day,mo,ye);
	else
 	  a.EF(dt,mo,ye);
}
}