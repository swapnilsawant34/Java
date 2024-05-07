package collection_practical;
import java.util.*;

public class Menu_driven_ArrayList {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(50);
		a.add(40);
		a.add(30);
		int len=a.size();
		
		System.out.println("Enter the  choice");
		int choice=xyz.nextInt();
		int val;
		switch(choice)
		{
		case 1:
			System.out.println("Enter the value to add");
			val=xyz.nextInt();
			
			
			addElement(a,val);
		break;
		
		case 2:
			System.out.println("Display the values:");
			showElements(a);
			break;
		case 3:
			System.out.println("Enter the element to delete:");
			val=xyz.nextInt();
			deleteElements(a,val);
			break;
		case 4:
			System.out.println("Enter the elements to search");
			val=xyz.nextInt();
			searchElements(a,val);
		break;
		
		case 5:
			sortElements(a);
			break;
			
			default:
			{
				System.out.println("Invalid choice");
			}
		}
		

	}


	// Function to add element to the ArrayList
	private static void addElement(ArrayList a, int val) {
		if(a.size()==10) {
			System.out.println("ArrayList is full");
		}
		else {
			a.add(val);
			System.out.println("Elements added successfully ArrayList!");
			System.out.println(a);
		}
		
	}
	
	 // Function to show elements of the ArrayList
	private static void showElements(ArrayList a) {
		if (a.isEmpty()) {
            System.out.println("ArrayList is empty!");
        } else {
            System.out.println("Elements in the ArrayList are:");
            for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(i));
            }
        }
		
	}
	// Function to delete element from the ArrayList
	private static void deleteElements(ArrayList a, int val) {
		if(a.contains(val))
		{
			a.remove(Integer.valueOf(val));
			System.out.println("Element deleted successfully!");
			System.out.println(a);
		}
		else {
			System.out.println("Element not found in ArrayList!");
		}
		
	}
	
	// Function to search element in the ArrayList
	private static void searchElements(ArrayList a, int val) {
		if(a.contains(val))
		{
			System.out.println("Element found in ArrayList");
		}
		else{
			System.out.println("Element not found in ArrayList");
		}
		
	}
	
	// Function to sort elements of the ArrayList
		private static void sortElements(ArrayList a) {
			if(a.isEmpty())
			{
				System.out.println("ArrayList is Empty!");
			}
			else {
				Collections.sort(a);
				System.out.println("Elements sorted successfully!");
				System.out.println(a);
				
				
				
			}
			
			
		}


}
