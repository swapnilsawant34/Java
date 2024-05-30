//Reverse string using collection.

package Wrapper_Class_Practical;
import java.util.*;
public class Reverse_String {

	public static void main(String[] args) {
		
		String str1="hello";
		char str2[]=str1.toCharArray();
		int len=str2.length; //length of character Array.
		
		ArrayList<Character>list=new ArrayList<>(); //Declaring ArrayList of Characters
		for(int i=0;i<len;i++)
		{
			list.add(str2[i]);  //adding character into list
		}
		Collections.reverse(list);  //reversing list
		int size=list.size();
		System.out.println("Revesed String is:");
		for(int i=0;i<size;i++)
		{
			System.out.print(list.get(i));  //printing characters from ArrayList in reversed format
			
		}
		
	     
		

	}
	       
	
}
/* int start=0,end = len-1;
while(start<=end) {
// Swapping the characters
char temp = str2[start];
str2[start] = str2[end];
str2[end] = temp;
start++;
end--;
String reversedString=String.valueOf(str2);
	       System.out.println(" "+reversedString);*/