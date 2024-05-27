package Practice_Code;
import java.util.*;
interface ArrayOperation{
	void acceptArray(int a[],int b[]);
}

class UnionArray implements ArrayOperation{

	@Override
	public void acceptArray(int a[],int b[]) {
		
		
		int m=a.length;
	       int n=b.length;
	       int x=0,y=0;
	       System.out.println("Union Array is:");
	       while(x<m && y<n)
	       {
	           if(a[x] < b[y])
	           {
	               System.out.print(a[x]+" ");
	               x++;
	           }
	           else if(b[y]<a[x])
	           {
	               System.out.print(b[y]+" ");
	               y++;
	           }
	           else
	           {
	               System.out.print(b[y]+" ");
	               x++;
	               y++;
	           }
	       }

	       while(x<m)
	       {
	           System.out.print(a[x]+" ");
	           x++;
	       }

	       while(y<n)
	       {
	           System.out.print(b[y]+" ");
	           y++;
	       }
		
		
	}
	
}
class IntersectionArray implements ArrayOperation
{

	@Override
	public void acceptArray(int a[],int b[]) {
		
		 int i=0,j=0;
		 System.out.println("Intersection Array is:");
	      while(i<a.length && j<b.length)
	      {
	          if(a[i]<b[j])
	          {
	              i++;
	          }
	          else if(b[j]<a[i])
	          {
	              j++;
	          }
	          else
	          {
	              System.out.print(b[j]+" ");
	              i++;
	              j++;
	          }
	      }
		
		
		
	}
	}
public class Union_Intersection {

	public static void main(String[] args) {
		
		Scanner xyz=new Scanner(System.in);
    	System.out.println("Enter the size for Array1");
    	
       int size1=xyz.nextInt();
       
       
       int a[]=new int[size1];
       System.out.println("Enter the array elements in Array1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
			
		}
       
		System.out.println("Enter the size for Array2");
    	
	       int size2=xyz.nextInt();
	       
	       
	       int b[]=new int[size2];
	       System.out.println("Enter the array elements in Array1");
			for(int i=0;i<b.length;i++)
			{
				b[i]=xyz.nextInt();
				
			}
			
			UnionArray u=new UnionArray();
			u.acceptArray(a,b);
			
			IntersectionArray i=new IntersectionArray();
			i.acceptArray(a,b);

	}

}
