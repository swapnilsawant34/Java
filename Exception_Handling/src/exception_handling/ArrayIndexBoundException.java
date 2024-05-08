package exception_handling;
import java.util.*;

//ArrayIndexOutOfBoundsException
public class ArrayIndexBoundException {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		try {
		int a[]=new int[2];
		a[2]=200;
		System.out.println("Value is"+a[2]);

	}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error is:"+ex);
		}

}
}
