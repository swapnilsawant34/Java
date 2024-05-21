package mergearray_construct;
import java.util.*;

class Merge
{
	int x[];
	int y[];
	int z[]=new int[10];
	Merge(int x[],int y[])
	{
		this.x=x;
		this.y=y;
	}
	
	void MergeArray()
    {
		int i,j,k;
		for(i=0;i<x.length;i++)
		{
			z[i]=x[i];
			
			
		}
		for(i=0,k=5;i<y.length;i++)
		{
			z[k]=y[i];
			k++;
			
		}
		
         
     }

      void display()
     {
    	  System.out.println("Mergegd array is");
    	  for(int i=0;i<z.length;i++)
  		{
  			System.out.println(""+z[i]);
  			
  			
  		}
    	  

		
     }
	
}

public class Mergearray_Constructor {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	
	int x[]=new int[5];
	int y[]=new int [5];
	
	
	Merge m=new  Merge(x, y);
	
	System.out.println("Enter the first array elements");
	for(int i=0;i<x.length;i++)
	{
		x[i]=xyz.nextInt();
		
	}

	System.out.println("Enter the second array elements");
	for(int i=0;i<y.length;i++)
	{
		y[i]=xyz.nextInt();
		
	}
	m.MergeArray();
	m.display();
	

	}

}
