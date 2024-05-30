package Wrapper_Class_Practical;
import java.util.*;
public class Reverse_String_collection {

	public static void main(String[] args) {
		String str1="hello mno";
		char str2[]=str1.toCharArray();
		
		ArrayList<Character> list=new ArrayList<>();
		for(char c:str2)
		{
			list.add(c);
		}
		Collections.reverse(list);
		Iterator i=list.iterator();
		
		while(i.hasNext())  //data fetching
		{
			Object obj=i.next();
			System.out.print(obj);
		}

	}

}
