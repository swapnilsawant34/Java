package collection_practical;

import java.util.ArrayList;
import java.util.Iterator;

public class Add_element {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a1.add(90);
		a1.add(100);
		
		Iterator i=a1.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			
			System.out.println(obj);
		}
		
		
	
	
	

}

}
