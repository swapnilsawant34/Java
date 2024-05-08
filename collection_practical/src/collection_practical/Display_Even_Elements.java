package collection_practical;

import java.util.ArrayList;
import java.util.Iterator;

public class Display_Even_Elements {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		a1.add(9);
		a1.add(10);
		
		
		System.out.println("Even elemnts are:");
		/*int len=a1.size();
		for(int i=0;i<len;i++)
		{
			Object obj=a1.get(i);
			
			if((int)obj%2==0) {
				
				System.out.println(obj);
			}
		}*/
		
		Iterator i=a1.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			
			if((int)obj%2==0)
			{
				System.out.println(obj);
			}
		}

	}

}
