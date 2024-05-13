/*Write a class with a parameterized constcructor and a method

  use constructor to set a number and use method to check whether given number is armstrong number or not
 and return result 0 if not a armstrong number and return 1 if armstrong number is there*/


package armstrong_constructor;
import java.util.*;
class Armstrong
{
	int no;
	
	Armstrong(int no) //constructor with parameter
	{
		this.no=no;
	}
	int getArmstrong()
	{
		int temp=no,sum=0;
		while(no>0)
		{
			int rem=no%10;  
			sum=sum+(rem*rem*rem); 
			no=no/10;        
		}
		
		if(temp==sum)
		{
			System.out.println("Number is armstrong");
			return 1;
			
		}
		else
		{
			System.out.println("Number is not armstrong");
			return 0;
		}
		
	}
	
}

public class ArmStrong_num {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int no;
		
		System.out.println("Enter the number");
		no=xyz.nextInt();
		
		Armstrong a=new Armstrong(no);
		int result=a.getArmstrong();
		
		System.out.println("Result is "+result);

	}

}
