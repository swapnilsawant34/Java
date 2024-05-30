package Wrapper_Class_Practical;
import java.util.*;

public class String_Anagram {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the First string:");
		String str1=xyz.nextLine();
		System.out.println("Enter the Second string:");
		String str2=xyz.nextLine();
		
		if(str1.length()==str2.length())
		{
			ArrayList<Character> al1=new ArrayList<Character>();
			for(int i=0;i<str1.length();i++)
			{
				char ch1=str1.charAt(i);
				al1.add(ch1);
			}
			ArrayList<Character> al2=new ArrayList<Character>();
			for(int i=0;i<str2.length();i++)
			{
				char ch2=str2.charAt(i);
				al2.add(ch2);
			}
			if(al1.containsAll(al2))
			{
				System.out.println("String is Anagram");
			}
			else {
				System.out.println("String is not Anagram");
			}
			
		}else {
			System.out.println("String is not Anagram");
		}

	}

}
