package question1;

import java.util.*;

public class question9
{
   public static void main(String x[])
   {
   
    Scanner xyz=new Scanner(System.in);
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	int i,j,k;
	
	System.out.println("Enter the first matrix elements\n");
	for(i=0;i<a.length;i++)
	{
	   for(j=0;j<a[i].length;j++)
	   {
	     a[i][j]=xyz.nextInt();
	   }
	
	}
	System.out.println("Enter the second matrix elements\n");
	for(i=0;i<b.length;i++)
	{
	   for(j=0;j<b[i].length;j++)
	   {
	     b[i][j]=xyz.nextInt();
	   }
	
	}
	
	
	
	System.out.println("Addition of matrix is");
	for(i=0;i<c.length;i++)
	{
	   
	   for(j=0;j<c[i].length;j++)
	   {
		   //c[i][j]=0;
		   //c[i][j]=c[i][j]+(a[i][j]*b[i][j]);
		   
		   c[i][j]=a[i][j]+b[i][j];
		   System.out.printf("%d\t",c[i][j]);
	   }
	   
	   
		 System.out.println(" ");
	}
}
}	
