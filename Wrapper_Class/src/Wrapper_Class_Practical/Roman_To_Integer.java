package Wrapper_Class_Practical;
import java.util.*;
public class Roman_To_Integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Roman number to covert into integer");
		String s=sc.nextLine();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		
		int result=0;
		int prev=0;
		for(int i = s.length()-1;i >= 0; i--) {
		int current=map.get(s.charAt(i));
		//System.out.println(current);
		
		if(current<prev)
		{
			result=result-current;
		}
		else {
			result=result+current;
		}
		 prev=current;
		 

	}
		System.out.println(result);
	}

}
