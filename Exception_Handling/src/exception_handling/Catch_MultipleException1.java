package exception_handling;
import java.util.*;
//without  Catch using multiple Exception class with single reference
public class Catch_MultipleException1 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		try {
			System.out.println("Enter the two numbers:");
			int a=xyz.nextInt();
			int b=xyz.nextInt();
			int c=a/b;
			System.out.println("Division is :"+c);
		}
		catch(ArithmeticException | InputMismatchException ex)
		{
		  System.out.println("Error is:"+ex);	
			
		}
		

	}

}
