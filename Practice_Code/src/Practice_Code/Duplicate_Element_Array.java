package Practice_Code;
import java.util.*;
public class Duplicate_Element_Array {

	public static void main(String[] args) {
	  Scanner xyz=new Scanner(System.in);
	  System.out.println("Enter the Array Size");
	  int size=xyz.nextInt();
	  int a[]=new int[size];
	  
	  System.out.println("Enter the elements");
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=xyz.nextInt();
	  }
	  
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]>a[j])
			  {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
		  }
	  }
	  
	  
	  for(int i=0;i<a.length;i++)
	  {
		  
		  int count=1;
		  for(int j=i+1;j<a.length;j++)
		  {
			  
			  if(a[i]==a[j])
			  {
				  count++;
				  System.out.println(" "+a[j]+" "+count);  
				  
				  
			  }
			  
			    
		  }
	  }

	}

}
