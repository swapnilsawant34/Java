package collection_practical;
import java.util.*;
public class Vector_Menu_driven {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(40);
		v.add(50);
		v.add(30);
		int len=v.size();
		System.out.println("Enter the choice:");
		int choice=xyz.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Display vector elements");
			
			for(int i=0;i<len;i++)
			{
				Object obj=v.get(i);
				
				System.out.println(obj);
			}
		
			/*for(Object obj:v) //using for each.
			 *{
			  * System.out.println(obj);
			  *}
			  */
			
			
			break;
			
		case 2:
			System.out.println("Find out vector capicity:");
			int capicity=v.capacity();
			System.out.println("Current capicity is:"+v.capacity());
			
			break;
			
		case 3:
			System.out.println("Enter the value to add in last index");
			int val=xyz.nextInt();
			v.addElement(val);
			System.out.println("Display the values:");
			
			for(int i=0;i<len+1;i++)
			{
				Object obj=v.get(i);
				
				System.out.println(obj);
			}
			
			
			break;
			
		case 4:
			System.out.println("Enter the value to search");
			int data=xyz.nextInt();
			
			int index=v.indexOf(data);
			if(index!=-1)
			{
				System.out.println("Data found at"+index+ " number");
				
				
			}
			else {
				System.out.println("Data not found");
			}
			break;
			
		
		case 5:
			System.out.println("Enter the index");
			int index1=xyz.nextInt();
			System.out.println("At"+index1+"index value"+v.get(index1));
			break;
			
			default:
			{
				System.out.println("Wrong option");
			}
		}
				

	}

	
}
