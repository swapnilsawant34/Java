package Practice_Code;
import java.util.*;
public class Missing_Element_array {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size=sc.nextInt();
      int x[]=new int[size];
      System.out.println("Enter the elements:");
      for(int i=0;i<x.length;i++)
      {
    	  x[i]=sc.nextInt();
      }
      
      for(int i=0;i<x.length;i++) {
    	  for(int j=i+1;j<x[i+1];j++) {
    		  if(j>x[i] && x[i+1]>j ) {
    			  System.out.println(j);
    		  }
    	  }
      }
		
		

	}

}
