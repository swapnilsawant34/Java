package collection_practical;
import java.util.*;

public class Display_Search {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		int len=a1.size();
		
		System.out.println("Enter the Choice");
		int choice=xyz.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Display all the array Elements");
			Iterator i=a1.iterator();
			
			while(i.hasNext())
			{
				Object obj=i.next();
				
				System.out.println(obj);
			}
			
			break;
			
		case 2:
			System.out.println("Enter the search element");
			int no=xyz.nextInt();
			
			Boolean b=a1.contains(no);
			
			if(b) {
				System.out.println("Element found");
			}
			else {
				System.out.println("Element not found");
			}
		break;
		
		default:{
			System.out.println("Invalid Choice");
		}
		
		
		}
			

	}

}
