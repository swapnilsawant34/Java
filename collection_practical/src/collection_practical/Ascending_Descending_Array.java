package collection_practical;

import java.util.ArrayList;


public class Ascending_Descending_Array {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(30);
		a.add(20);
		a.add(120);
		a.add(3);
		a.add(60);
		System.out.println("Before sorting:"+a);
		
		int len=a.size();
		
		
		System.out.println();
		
		
		
		for(int i=0;i<len;i++)
		{
		
			for(int j=i+1;j<len;j++)
			{
				Object prev=a.get(i);
				Object next=a.get(j);
				
				if((int)prev>(int)next)
				{
					a.set(i, (int) next);
					a.set(j, (int) prev);
					
				}
				
			}
			
		}
		
		System.out.println("Ascnding Order:"+a);
		
	
			
		for(int i=0;i<len;i++)
		{
		
			for(int j=i+1;j<len;j++)
			{
				Object prev=a.get(i);
				Object next=a.get(j);
				
				if((int)prev<(int)next)
				{
					a.set(i, (int)next);
					a.set(j, (int)prev);
					
					
				}
				
			}
			
		}
		
		System.out.println("Decending Order:"+a);
				
	}
}
			

		

