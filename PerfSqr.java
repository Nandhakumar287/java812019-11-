import java.io.*;
import java.util.*;
import java.lang.*;
  public class PerfSqr{
    public static void main(String main[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter L:");
      int L=sc.nextInt();
      System.out.println("Enter R:");
      int R=sc.nextInt();
	  double x;
	  int count=0;
      for(int i=L;i<=R;i++)
        {
          x=(Math.sqrt(i))*(Math.sqrt(i));
          if(x==i)
            {
              count++;
            }
         }
		 System.out.println(count);
      }
   } 
