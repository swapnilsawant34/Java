package majority;
import java.util.*;
class FindMajority{
	int a[];
	
	void acceptArray(int a[])
	{
	this.a=a;
		
	}
	
	
	void getMajorityElement()
	{
		
		int i,j,count=0;boolean flag=false;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				if(count>(a.length/2))
				{
					//System.out.println("Majority"+a[i]);
					flag=true;
					break;
				}
				
			}
		
			if(flag)
			{
				System.out.println("Majority Element found");
				System.out.println("Majority "+a[i]);
				break;
				
			}
			else
			{
				System.out.println("There are no Majority Elements in given array");
				break;
			}
		}
		//return 0;
		
	}
	
	
}


public class MajorityApp {

	public static void main(String[] args) {
	  Scanner xyz=new Scanner(System.in);
	  
	FindMajority f= new FindMajority();
      int a[]=new int[10];
	System.out.println("Enter the elements");
	  
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=xyz.nextInt();
		  
		 
		 
	  }
	  f.acceptArray(a);
	  f.getMajorityElement();
	  
	

	}

}
