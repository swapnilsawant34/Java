package collection_practical;

import java.util.ArrayList;

public class Array_Max_Min {

	public static void main(String[] args) {
		ArrayList  a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		int len=a.size();
		
		int max=(int)a.get(0);
		
		for(int i=0;i<len;i++)
		{
			Object obj=a.get(i);
			if(max<(int)obj) {
				max=(int)obj;
			}
			
		}
		System.out.println("Maximum number is:"+max);
		
		int min=(int)a.get(0);
		
		for(int i=0;i<len;i++)
		{
			Object obj=a.get(i);
			if(min>(int)obj)
			{
				min=(int)obj;
			}
		}
		System.out.println("Minimum number is:"+min);
	
		

	}

}
