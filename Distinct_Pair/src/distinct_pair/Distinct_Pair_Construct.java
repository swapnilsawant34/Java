package distinct_pair;

import java.util.*;
class Pair
{
	int x[];
	int no;
	Pair(int x[],int no)
	{
		this.x=x;
		this.no=no;
	}
	
	
	
	void show()
	{
		int count=0;
		System.out.println("Distinct pairs");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i]-x[j]==no)
				{
					
					System.out.println("\t"+x[i]+"\t"+x[j]);
					count++;
					
					
					
				}
				
			}
			
			
		}
		System.out.println("Pair of count:"+count);
		
	}


}


public class Distinct_Pair_Construct {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		
		int x[]=new int[8];
		int no;
		
		
		System.out.println("Enter the array elements");
		for(int i=0;i<x.length;i++)
		{
			x[i]=xyz.nextInt();
			
		}
		System.out.println("Enter the diffrence");
		no=xyz.nextInt();
		
		Pair p=new Pair(x,no);
		p.show();

	}

}
