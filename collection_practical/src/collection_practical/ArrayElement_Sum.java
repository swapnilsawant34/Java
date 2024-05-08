package collection_practical;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayElement_Sum {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		/*
		 * int len=a1.size();
		 * int sum=0;
		for(int i=0;i<len;i++)
		{
			Object obj=a1.get(i);
			
			sum=sum+(int)obj;
			
		}
		System.out.println("Sum of array elements is:"+sum);
		 */
		
		
		int sum=0;
		
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			sum=sum+(int)obj;
			
			
		}
		System.out.println("Sum of array element is:"+sum);

	}

}
