package exception_handling;
import java.util.*;
public class NumberFormatException {

	public static void main(String[] args) {
		String s="12345";
		try {
		int a=Integer.parseInt(s);
		
		System.out.println("A is:"+a);

	}
		catch(Exception ex){  //NumberFormatException
			
			System.out.println("Ther no problem in the coversion");
			}
		}

}
