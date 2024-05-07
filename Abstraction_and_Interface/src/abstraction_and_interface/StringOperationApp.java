package abstraction_and_interface;
import java.util.*;
abstract class StringOperation
{
	abstract void performoperation(String x);
}

class ConverttoUpper extends StringOperation
{
	
	public void performoperation(String x)
	{
		char ch[];
		
		ch=x.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
			
		}
		System.out.println("Converted string is");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
			
		}
		
	}
}
class MaxRepetativeChar extends StringOperation
{
	public void performoperation(String x)
	{
		
		char ch[];
		ch=x.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j]) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
			}
		}
		}
		System.out.println("\nMaximum char is:");
		for(int i=0;i<ch.length-1;i++)
		{
			int count=0;
			if(ch[i]==ch[i+1])
			{
				count++;
			}
			else
			{
				System.out.print(ch[i]);
				count=1;
			}
		}
	}
	
	
}






public class StringOperationApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String x=xyz.nextLine();
		
		
		 ConverttoUpper c=new  ConverttoUpper();
		 c.performoperation(x);
		
		 MaxRepetativeChar m=new MaxRepetativeChar();
		 m.performoperation(x);

	}

}
