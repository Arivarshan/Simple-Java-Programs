import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class S{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count=0,k=0;
        int t = sc.nextInt();
        int m[]=new int[2];
        while(t!=0)
        { 
            for(int i=0;i<2;i++)
                     m[i]=sc.nextInt();
        int x=m[0];
        int y=m[1];
        int a1[]=new int[x];
        int a2[]=new int[y];
        int c[]=new int[x + y];
            for(int j=0;j<x;j++)
                    a1[j]=sc.nextInt();
            for(k=0;k<y;k++)
                    a2[k]=sc.nextInt();
        int h=0, l=0,m1=0,i1=0,j1=0;
        while (l < x && m1 < y) 
         { 
            if (a1[l] < a2[m1]) 
		{
                 c[h] = a1[i1];
		 h++;
		 i1++;
		} 
            else
		{
                 c[h] = a2[j1];
		 h++;
		 j1++;
		} 
         }
        while (i1 < x) 
	{
            c[h] = a1[i1]; 
		h++;
		i1++;
	}
        while (j1 < y) 
	{
            c[h] = a2[j1]; 
		h++;
		j1++;  
	}

          t--;  
        } 
        
       
        }
    }

        