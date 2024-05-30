package question1;
import java.util.*;
class ArrayCons
{
	int a[];int value;
	ArrayCons (int a [],int value)
	{
		this.a=a;
		this.value=value;
		
	
	boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(value==a[i])
			{
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("not Found");
		}
		
	}
	
	ArrayCons (int a [])
	{
		this.a=a;
		int  max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.printf("max value is %d",max);
	}
	
	
}

public class question7 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.println("Enter the search value");
		int value=xyz.nextInt();
		
		
		ArrayCons obj1=new ArrayCons(a,value);
		
		ArrayCons obj2=new ArrayCons(a);
		

	}

}
