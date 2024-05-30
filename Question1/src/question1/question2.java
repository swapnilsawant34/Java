package question1;

import java.util.Scanner;


public class question2 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner (System.in);
		
		int a[]=new int[5];
		
		int index;
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.println("Enter the index");
		index=xyz.nextInt();
		
		for(int i=index;i<a.length-1;i++)
		{
			
			
				a[i]=a[i+1];
		}
			
			
			for(int i=index;i<a.length-1;i++)
			{
				System.out.printf("a[%d]--->%d\n",i,a[i]);
			}
		
		
		
		
		

	}

}
