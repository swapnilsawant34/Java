package collection_class_program;
import java.util.*;
public class SearchValue_Contains {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println("Enter the value in collection");
		Scanner xyz=new Scanner(System.in);
		
		do {
			int value=xyz.nextInt();
			v.add(value);
			xyz.nextLine();
			System.out.println("Do you to stop");
			String msg=xyz.nextLine();
			if(msg.equals("yes"))
			{
				break;
			}
			
		}while(true);
		System.out.println("Enter the value to search");
		int data=xyz.nextInt();
		boolean b=v.contains(data);
		if(b)
		{
			System.out.println("Data found");
		}
		else {
			System.out.println("Data not found");
		}

	}
/*
 * System.out.println("Enter data for search");
int data =xyz.nextInt();
int index = v.indexOf(data);
if(index!=-1) 
System.out.println("Data found");
}
else {
System.out.println("Data not found");
}
}
}
 */
}
