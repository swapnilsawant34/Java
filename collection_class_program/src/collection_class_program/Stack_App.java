/*Case 1: Add New Element in Stack
Case 2: View All Elements From Stack
Case 3: Remove element from Stack
Case 4: Peek element from a Stack
 * 
 * 
 * 
 */


package collection_class_program;
import java.util.*;
public class Stack_App {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Stack s=new Stack();
		
		do {
			System.out.println("Enter the choice");
			int choice=xyz.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the valus in stack");
				int value=xyz.nextInt();
				s.push(value);
				break;
			case 2:
				ListIterator li=s.listIterator(s.size());
				while(li.hasPrevious())
				{
					Object obj=li.previous();
					System.out.println(obj);
					
				}
				break;
			case 3:
				boolean b=s.isEmpty();
				if(b)
				{
					System.out.println("Stack is empty");
				}else {
					Object obj=s.pop();
					System.out.println("Delete value is:"+obj);
				}
				break;
			case 4:
				b=s.isEmpty();
				if(b)
				{
					System.out.println("Stack is empty");
				}else {
					Object obj=s.peek(); //this method can fetch only top most data not remove.
					System.out.println("Top value is:"+obj);
				}
				
			}
		}while(true);

	}

}
