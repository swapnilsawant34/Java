package collection_practical;

import java.util.ArrayList;

public class Primeno_ArrayList {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(11);
		Object obj[]=a.toArray();
		int len=a.size();
		 System.out.println("Prime numbers are:");
		for(int i=0;i<len;i++)
		{
			boolean b=false;
			
			for(int j=2;j<(int)obj[i];j++)
			{
				if((int)obj[i]%j==0)
				{
					b=true;
					break;	
					
				}
				
			}
			if(b==false)
			{
				System.out.println(obj[i]);
			}
			
		}
		
		

	}

}
