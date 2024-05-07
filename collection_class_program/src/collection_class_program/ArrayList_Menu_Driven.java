/*1.Add new Element in arraylist.
 * 2.View All from arraylist.
 * 3.Search specific element from arraylist.
 * 4.view all element in reverse direction.
 * 5.find the index of specified element in arraylist.
 * 6.remove the specified element from arraylist.
 * 7.count the size of arraylist.
 */





package collection_class_program;
import java.util.*;
public class ArrayList_Menu_Driven {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList al=new ArrayList();
		int choice;
		do {
		System.out.println("Enter the choice");
		choice=xyz.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the count you want to add in collection:");
			int count=xyz.nextInt();
			System.out.println("Enter the value in arraylist");
			for(int i=1;i<=count;i++)
			{
				int value=xyz.nextInt();
				al.add(value);
			}
		break;
		case 2:
			for(Object obj:al)
			{
				System.out.println(obj);
			}
			
		break;
		case 3:
			System.out.println("Enter the value for search");
			int val=xyz.nextInt();
			boolean b=al.contains(val);
			if(b)
			{
				System.out.println("Element found......");
			}else {
				System.out.println("Element not found......");
			}
		break;
		
		case 4:
			ListIterator li=al.listIterator(al.size());
			while(li.hasPrevious())
			{
				Object obj=li.previous();
				System.out.println(obj);
			}
		break;
		
		case 5:
			System.out.println("Enter the value:");
			int eval=xyz.nextInt();
			int index=al.indexOf(eval);
			if(index!=-1)
			{
				System.out.println("Element index is:"+index);
			}
		break;
		
		case 6:
			System.out.println("Remove element from array list:");
			int rval=xyz.nextInt();
			al.remove(rval);
			System.out.println(al);
			break;
			
		case 7:
			
			System.exit(0);
			break;
			default:
				System.out.println("Wrong choice");
		}

	}while(true);

}
}