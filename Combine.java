import java.util.*;
import java.lang.*;
public class Combine{
	public static void main(String args[])
	{
		/*int a1[]={1,2,3};
		int a2[]={4,5,6};
		int a3[]=new int[a1.length+a2.length];
		System.arraycopy(a1,0,a3,0,a1.length);
		System.arraycopy(a2,0,a3,a2.length);
		//int a3[]=ArrayUtils.addAll(a1,a2);
		for(int i=0;i<=a3.length;i++)
			System.out.println(""+a3[i]);*/

      int[]a = {1,2,3,4};
      int[]b = {4,16,1,2,3,22};
      int[]c = new int[a.length+b.length];
      int count = 0;
      
      for(int i = 0; i < a.length; i++) { 
         c[i] = a[i];
         count++;
      } 
      for(int j = 0; j < b.length;j++) { 
         c[count++] = b[j];
      } 
      for(int i = 0;i < c.length;i++) System.out.print(c[i]+" ");
	}
}
