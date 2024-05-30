package question1;

import java.util.*;

class FindDuplicate
{
	int a[];
	FindDuplicate(int a[])
	{
		this.a=a;
		
	}
	void duplicate()
	{
		
	}

	
	
}







public class question6 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		FindDuplicate f=new FindDuplicate(a);
		f.duplicate();

	}

}
