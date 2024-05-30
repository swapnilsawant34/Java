package question1;
import java.util.*;
public class question1 {

	public static void main(String[] args) {
		
		Scanner xyz=new Scanner (System.in);
		
		int a,b;
		
		System.out.println("Enter the value of a and b");
		
		a=xyz.nextInt();
		b=xyz.nextInt();
		
		System.out.println("Numbers before swapping");
		System.out.println("\t"+a+"\t"+b);
		
		a=a+b;
		b=a-b;
		
		a=a-b;
		
		System.out.println("Numbers after swapping");
		System.out.println("\t"+a+"\t"+b);
		
		

	}

}

