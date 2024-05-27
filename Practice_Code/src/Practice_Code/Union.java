package Practice_Code;
import java.util.*;
public class Union
{
    public static void main(String[] args) {
       //int []a={1,3,4,5,7};
       //int []b={2,3,5,6};
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
