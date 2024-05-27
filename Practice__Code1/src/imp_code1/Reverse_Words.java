package imp_code1;
import java.util.*;
public class Reverse_Words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String rstr="";
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ') {
				st.push(str.charAt(i));
			}else {
				while(st.empty()==false) {
					System.out.println(st.pop());
					
				}
			}
			
		}
		System.out.println(" ");
		
		while(st.empty()==false) {
			System.out.println(st.pop());
			
		}
		
     
	}

}
