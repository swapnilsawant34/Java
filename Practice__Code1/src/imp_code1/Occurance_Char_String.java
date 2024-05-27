package imp_code1;
import java.util.*;
public class Occurance_Char_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");  //hello
		String str=sc.nextLine();
		int initialLength=str.length();        //5
		
		System.out.println("Enter the character to find the occurance:");
		String str1=sc.next();  //l
		
		str=str.replace(str1,"");  //heo
		
		int finalLength=str.length(); //3
		
		System.out.println("Total Number of occurances of Character:"+(initialLength-finalLength));
		                                                                //5-3=2

	}

}
