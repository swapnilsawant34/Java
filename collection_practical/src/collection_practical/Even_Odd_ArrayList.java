package collection_practical;

import java.util.ArrayList;

public class Even_Odd_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		
		int len=a.size();
		System.out.println("Even Number:");
		for(int i=0;i<len;i++)
		{
			Object obj=a.get(i);
			
			if((int)obj%2==0)
			{
				System.out.println(obj);
			}
			
		}
		System.out.println("Odd Number:");
		for(int i=0;i<len;i++)
		{
			Object obj=a.get(i);
			if((int)obj%2==1)
			{
				System.out.println(obj);
			}
		}

	}
		

}


