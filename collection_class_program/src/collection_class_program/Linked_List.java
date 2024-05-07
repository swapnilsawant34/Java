package collection_class_program;
import java.util.*;
public class Linked_List {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		LinkedList list=new LinkedList();
		System.out.println("Enter the count you want store in collection:");
		int count=xyz.nextInt();
		for(int i=1;i<=count;i++)
		{
			int value=xyz.nextInt();
			list.add(value);
		}
		for(Object obj:list)
		{
			System.out.println(obj);
		}

	}

}
