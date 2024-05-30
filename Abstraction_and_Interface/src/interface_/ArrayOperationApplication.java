package interface_;
import java.util.*;
interface ArrayOperation{
	void acceptArray(int a[]);
}

class CheckDuplicate implements ArrayOperation
{
	public void acceptArray(int a[] )
	{
		
		boolean b=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					
						b= true;
						break;
					
					}
				}
				
			}
			System.out.println("Array Duplicate has"+ b);
			
		}
		
	
	
	
	
}
class CountDuplicate implements ArrayOperation{
	public void acceptArray(int a[] )
	{
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					
						count++;
						
					
					}
				}
				
			}
			System.out.println("Number of duplicate"+ count);
			
		}
		
}	


public class ArrayOperationApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner xyz=new Scanner(System.in);
		
		int a[]=new int[6];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		CheckDuplicate c=new CheckDuplicate();
		c.acceptArray(a);
		
		 CountDuplicate c1=new  CountDuplicate();
		 c1.acceptArray(a);
		

	}

}
