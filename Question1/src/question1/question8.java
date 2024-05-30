package question1;

import java.util.*;


public class question8
{
   public static void main(String x[])
   {
   Scanner xyz=new Scanner(System.in);
   int i,j;
   int a[][]=new int[3][];
   a[0]=new int[3];
   a[1]=new int[4];
   a[2]=new int[2];
   
   System.out.println("Enter the array elements\n");
   for(i=0;i<a.length;i++)
   {
     for(j=0;j<a[i].length;j++)
	 {
	   a[i][j]=xyz.nextInt();
	 }
   }
   
   
    System.out.println("Display jagged array\n");
   for(i=0;i<a.length;i++)
   {
     for(j=0;j<a[i].length;j++)
	 {
	   System.out.printf("%d\t",a[i][j]);
	 }
	 
	 System.out.println("\t");
   }
   }
}
