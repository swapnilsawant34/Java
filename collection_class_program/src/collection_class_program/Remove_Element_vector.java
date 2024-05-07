package collection_class_program;
import java.util.*;

public class Remove_Element_vector {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter the value which you want store");
		int count=xyz.nextInt();
		for(int i=1;i<=count;i++)
		{
			int value=xyz.nextInt();
			v.add(value);
		}
		System.out.println("before remove "+v);
		System.out.println("Enter the value to delete");
         int value=xyz.nextInt();
         int index=v.indexOf(value);
         if(index!=-1)
         {
        	 v.remove(index);
        	 System.out.println("Elemnet remove successfully...");
         }
         else {
        	 System.out.println("data not found");
         }
         System.out.println("After remove"+v);
	}

}
