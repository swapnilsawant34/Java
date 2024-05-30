package abstraction_and_interface;
import java.util.*;
public class SeriesApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("1");
			}
				System.out.println("\t");
		}

	}

}
