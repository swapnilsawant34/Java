package Wrapper_Class_Practical;

import java.util.*;

public class Panagram_string {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=xyz.nextLine();
		
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='a'&& str.charAt(i)<='z') || (str.charAt(i)>='A'&& str.charAt(i)<='Z'))
			{
				flag=true;
			}
			else {
				flag=false;
			}
		}
		if(flag) 
		{
			System.out.println("Panagram String");
		}
		else 
		{
			System.out.println("not Panagram String");
		}
		

	}

}
