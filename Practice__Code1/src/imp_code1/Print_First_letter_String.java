package imp_code1;
import java.util.*;
//java program to get first letter of each word in String.

public class Print_First_letter_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String...");
		String str=sc.nextLine();
		
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String s=words[i];
			System.out.println(s.charAt(0));
		}
		
		

	}

}
