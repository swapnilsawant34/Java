package exception_handling;
import java.util.*;
public class NullPointerException {

	 static int a[];
	public static void main(String[] args)
	{
		
		try {
			a[2]=200;
			System.out.println("value is:"+a[2]);

	}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			
		}

}
}
