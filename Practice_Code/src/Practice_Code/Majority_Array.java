package Practice_Code;
import java.util.*;
public class Majority_Array {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=xyz.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		boolean flag=false;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				if(count>a.length/2)
				{
					flag=true;
					break;
					
				}
			}
			if(flag)
			{
				System.out.println("Majority element is:"+a[i]);
			}
			
		}
		

	}

}
