import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   static int flag=0;
   static int count=0;
    static int count1=0;
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);        
        int a=sc.nextInt(); 
    if(a>11 || a<0){
        System.exit(0);
    }
    int[] array=new int[a];
    for(int i=0;i<a;i++)
        {
            array[i]=sc.nextInt(); 
            int b=array[i];
             check(b);
             if(flag==0)
                {
                    System.out.println(0);
                    continue;
                }
             else{
            int c1=plus(b);
         flag=1;
         int c2=minus(b);    
          if(c1<=c2){
                     System.out.println(c1);
             count=0;
                 count1=0;
                     continue;
                 }
                 else{
                     System.out.println(c2);
                  count=0;
                 count1=0;
             continue;
                 }
             }
        }
    }
    static int check(int c)
    {
         while(c!=0)
             {
                int d=c%10;
                c=c/10;
                int e=d%2;
                if( e!=0)
                {
                    flag=1;
                    break;
                }   
                else
                {
                    flag=0;
                }
               
             }
             return flag;
    }
    static int plus(int c)
    {
     while(flag!=0)
                 {
                   c=c+1;
                    flag=check(c);  
                    count =count+1;
                  }
        return count;
    }
    static int minus(int c)
    {
       while(flag!=0)
                 {
                    c=c-1;
                    flag=check(c);
                    count1 =count1+1;
                 }
            return count1; 
    }
}
