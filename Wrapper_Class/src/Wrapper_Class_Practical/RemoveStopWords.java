package Wrapper_Class_Practical;
import java.util.*;
public class RemoveStopWords {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enter the String");
		String s1=xyz.nextLine();
		
		String s2="i am like my";  //stop words here you can add more words.
		String s4[]=s1.split(" ");
		String stop[]=s2.split(" ");
		for(String words:s4)
		{
			boolean flag=false;
			for(String s3:stop)
			{
				if(s3.equals(words))
				{
					flag=true;
				}
			}
			if(!flag)
			{
				al.add(words);
			}
		}
		String ss="";
		for(String s:al)
		{
			ss=ss+s+"";
		}
		System.out.println(ss);

	}

}
