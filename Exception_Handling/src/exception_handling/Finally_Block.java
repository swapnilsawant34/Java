package exception_handling;
import java.util.*;

public class Finally_Block {

	public static void main(String[] args) {
		try(Scanner xyz=new Scanner(System.in))
		{
			System.out.println("Enter the two number");
			int a=xyz.nextInt();
			int b=xyz.nextInt();
			int c=a/b;
			System.out.println("Division is:"+c);
		}
		
		catch(Exception ex)
		{
			System.out.println("Error is:"+ex);
		}
		finally {
			System.out.println("I can Execute always");
		}
		System.out.println("Logic1");
		System.out.println("Logic2");
		System.out.println("Logic3");

	}

}
