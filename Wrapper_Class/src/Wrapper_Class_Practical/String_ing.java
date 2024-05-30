package Wrapper_Class_Practical;
import java.util.*;
//remove ing in given string.
public class String_ing {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		String str="good morning india good afternoon india good evening india";
		String words[]=str.split(" ");
		String newWord="";
		for(String s:words) {
			boolean b=s.endsWith("ing");
			if(b) {
				s=s.substring(0,(s.length()-3));
			}
			al.add(s);
		}
		str="";
		for(String s:al) {
			str=str+s+" ";
		}
		System.out.println(str);

	}

}
