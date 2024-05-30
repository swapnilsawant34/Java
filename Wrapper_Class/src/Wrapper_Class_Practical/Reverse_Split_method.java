package Wrapper_Class_Practical;
import java.util.*;
public class Reverse_Split_method {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=xyz.nextLine();
		String word;
		String words[]=str.split(" ");
		ArrayList<String> al=new ArrayList<String>();
		for(String wordd:words) {
			char[] ch=wordd.toCharArray();
			for(int i=0;i<(ch.length/2);i++) {
				char temp=ch[i];
				ch[i]=ch[(ch.length)-i-1];
				ch[(ch.length)-i-1]=temp;
			}
			word=String.valueOf(ch);
			al.add(word);
		}
		String s="";
		for(String st:al) {
			s=s+st+" ";
		}
		System.out.println(s+" ");

	}

}
