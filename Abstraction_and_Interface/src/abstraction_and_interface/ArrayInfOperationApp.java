package abstraction_and_interface;
import java.util.*;

interface ArrayOperation
{
	void performOperation(int x[]);
	

}

class Sorting implements ArrayOperation
{

	
	public void performOperation(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
				}
			}
		}
		System.out.println("Sorted array is:");
		for(int i=0;i<x.length;i++)
		{
			System.out.println("\t"+x[i]);
		}
		
	}
}

class Insertion implements ArrayOperation
{
	int no,ind;
	void setValue(int value,int index)
	{
		no=value;
		ind=index;
	}
	public void performOperation(int x[])
	{
		for(int i=4;i>=ind;i--)  
		{
			x[i+1]=x[i];
		}
		x[ind]=no;
		System.out.println("Array after the insert element");
		for(int i=0;i<6;i++)
		{
			System.out.printf("x[%d]---->%d\n",i,x[i]);
			
		}
	}
	
}
class Deletion implements ArrayOperation
{
	int ind;
	int d_value;
	void setIndex(int index)
	{
		ind=index;
		//this.d_value=d_value;
	}
	
	public void performOperation(int x[])
	{
	
	for(int i=ind;i<x.length-1;i++)
	{
		x[i]=x[i+1];
				
	}
	
	for(int i=0;i<x.length-1;i++)
	{
		System.out.printf("a[%d]--->%d\n",i,x[i]);
	}
}
	
	/*public void performOperation(int x[])
	{
		int j=0;
		//System.out.println("Delete array element");
		for(int i=0;i<5;i++)
		{
			if(x[i]==d_value)
			{
				j=i;
				break;
			}
		}
		
		
		for(int i=j;i<5;i++)
		{
			x[i]=x[i+1];
			
		
		}
		
		System.out.println("Delete array element");
		for(int i=0;i<5;i++)
		{
			//System.out.printf("x[%d]---->%d\n",i,x[i]);
			System.out.println("\t"+x[i]);
		}
	}*/
	
	
	
}

class Rev implements ArrayOperation
{
	public void performOperation(int x[])
	{
		for(int i=0;i<x.length/2;i++)  //5
		{
			int temp=x[i];                             
			x[i]=x[x.length-i-1];
			x[x.length-i-1]=temp;
		}
		
		System.out.println("Reverse array is:");
		for(int i=0;i<x.length;i++)
		{
			System.out.println("\t"+x[i]);
		}
	}
	
}



public class ArrayInfOperationApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		int x[]=new int[6];
		System.out.println("Enter the array elements");
		for(int i=0;i<x.length;i++)
		{
			x[i]=xyz.nextInt();
		}
		
		System.out.println("Enter the index");
		int index=xyz.nextInt();
			
		System.out.println("Enter the choice");
		int choice=xyz.nextInt();
		
		switch(choice)
		{
		
		case 1:
			Sorting s=new Sorting();
			s.performOperation(x);
			break;
			
			
		case 2:
			
		
			System.out.println("Enter the value to insert in array");
			int value=xyz.nextInt();
			
			Insertion i=new Insertion();
			i.setValue(value,index);
			i.performOperation(x);
			
			break;
		case 3:
			
			
			//System.out.println("Enter the value to delete");
			//int d_value=xyz.nextInt();
			
			
			Deletion d=new Deletion();
			d.setIndex(index);
			d.performOperation(x);
			break;
		case 4:
			Rev r=new Rev();
			r.performOperation(x);
			break;
		default:
		{
			System.out.println("Invalid choice");
		}
		
		}
		
	

	}

}
