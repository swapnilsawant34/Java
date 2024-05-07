package collection_class_program;
import java.util.*;
public class DecendingSetApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		TreeSet treeset=new TreeSet();
		System.out.println("Enter the count of elements you want to add");
		int count=xyz.nextInt();
		for(int i=1;i<=count;i++)
		{
			int value=xyz.nextInt();
			treeset.add(value);
		}
		NavigableSet nav=treeset.descendingSet();
		
		System.out.println("Decending order:");
		for(Object obj:nav)
		{
			System.out.println(obj);
		}
		

	}

}
/*
 * if we want to arrange 
TreeSet Collection in Descending order then we have descendingSet() method of TreeSet Collection and 
this method return reference of NavigableSet interface.
NavigableSet interface is used for travel the collection in descending order.
Syntax: NavigableSet ref =treesetref.descendingSet();
 * 
 */
