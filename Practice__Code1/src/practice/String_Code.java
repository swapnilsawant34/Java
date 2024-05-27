package practice;
import java.util.*;
/*public class String_Code {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String rstr="";
		
		int len=str.length();
		
		for(int i=(len-1);i>=0;i--)
		{
			rstr=rstr+str.charAt(i);
		}
		System.out.println(rstr);
		
		if(str.equals(rstr))
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}*/

//java program to reverse a word and palindrome


/*class String_Code {
	public static void main (String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the String:");
		String str=sc.nextLine(); 
		String rstr="";
		char ch;
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		rstr= ch+rstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ rstr);
	
	if(str.equals(rstr))
	{
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	
	}
}*/


//Java program to Reverse a String using swapping
//of variables


//Class of ReverseString
/*class String_Code {
	public static void main(String[] args)
	{
		String input = "Geeks For Geeks ghhj";
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		for (char c : temparray)
			System.out.print(c);
		System.out.println();
	}
}*/


public class String_Code {
	public static void main(String[] args) {
		String str = "Java Programming";
//Create an array of words
//[Java,Programming]
		String[] words = str.split(" ");
		String revString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length()-1; j>=0; j--) {
				revWord = revWord + word.charAt(j);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
	}
}



