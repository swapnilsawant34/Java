package missing_array_element_connstruct;

import java.util.Scanner;


class Missing_Element
{
	int x[];
	Missing_Element(int x[])
	{
		this.x=x;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i+1];j++)
			{
				if(j>x[i] && j<x[i+1])
				{
					System.out.println(j);
				}
			}
		}
		
		
	}
	
	
}


public class Missing_Smallest_Element {

	public static void main(String[] args) {
		
Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=xyz.nextInt();
		int x[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<x.length;i++)
		{
			x[i]=xyz.nextInt();
			
		}
		Missing_Element m=new Missing_Element(x);
		
		

	}

}
