package Wrapper_Class_Practical;
import java.util.*;

public class Duplicate_word_count {

	public static void main(String[] args) {		
		//LinkedHashMap <Integer,String> map = new LinkedHashMap<Integer,String>();
		LinkedHashMap <String,Integer> duplicateString = new LinkedHashMap<String,Integer>();  //create Hashmap.
		String str="abc mno pqr abc";
		String words[]=str.split(" ");  //split the string.
		
		int count=1;
		for(String s1:words)      //to check each word in given array 
		{
		if(duplicateString.containsKey(s1))  //if word is present
		{
			duplicateString.put( s1,duplicateString.get(s1)+1);  //if word is available then counter incresed by +1.
			                    //key,value(count)
		}
		else
		{
			duplicateString.put(s1,1);//if value is not present then put value as 1 but in our case count=1 so I write count.
			                   //key,value
		}
		}
		// Set<Map.Entry<Integer, String>> data=map.entrySet();
		System.out.println("Duplicate word in string");  
		for(Map.Entry v:duplicateString.entrySet()) {     
            
			int value=(Integer)v.getValue();
			if(value>1)
			{
				System.out.println(v);
			}
		}
		
		//extracting all the keys of map-duplicateString.
		Set<String> wordsInString=duplicateString.keySet();
		
		//loop through all the words in duplicateString.
		for(String s1:wordsInString)
		{
			int value=(Integer)duplicateString.get(s1);
			if(value>1)
			{
				System.out.println(s1+ ":"+value);
			}
		}
			
     
}
}
