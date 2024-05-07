package collection_practical;

import java.util.ArrayList;
import java.util.Iterator;

public class Add_String {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("qw");
		a1.add("er");
		a1.add("ty");
		a1.add("ui");
		a1.add("op");
		a1.add("as");
		a1.add("df");
		a1.add("gh");
		a1.add("jk");
		a1.add("lz");
		
		Iterator i=a1.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			
			System.out.println(obj);
		}

	}

}
