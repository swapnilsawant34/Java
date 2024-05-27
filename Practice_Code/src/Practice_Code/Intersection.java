package Practice_Code;
import java.util.*;

public class Intersection
{
    public static void main(String[] args) {
     // int []a={1,4,7,8,9};
      //int []b={2,4,6,7,9};
    	
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
    	
      int i=0,j=0;

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