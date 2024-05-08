package exception_handling;
import java. util.*;

//Arithmetic Exception
public class Arithmatic_Exception {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter the two numbers");
		int a=xyz.nextInt();
		int b=xyz.nextInt();
		int c;
		
		try  //try block in which exception may occur.
		{
			c=a/b;  //9/0--//JVM create object of exception as per exception type
			System.out.println("Division is:"+c);
		}
		catch(ArithmeticException ex)  //handle exception by catch block
		{
			System.out.println("Error is:"+ex);
		

	}
		System.out.println("Logic 1");
		System.out.println("Logic 2");

}
}
