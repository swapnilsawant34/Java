package Wrapper_Class_Practical;
import java.util.*;
public class Longest_Common_Prefix_String {

	public static void main(String[] args) {
		LinkedHashMap <String,Integer> longestCommon = new LinkedHashMap<String,Integer>();  
		String str="ram ramesh shyam ganesh rajesh dinesh sandeep rangnath";
		String words[]=str.split(" ");
		String s=" ";
		
		for(String word:words)
		{
			
			 s=str.substring(0,2);
			
			
			
				longestCommon.put(s,longestCommon.get(s)+1 );
			
			
			
			
			
			
		}
		
Set<String> Longest=longestCommon.keySet();
		
		
		for(String str1:Longest)
		{
			int value=(Integer)longestCommon.get(s);
			if(value>1)
			{
				System.out.println(s+ ":"+value);
			}
		}

	}

}
