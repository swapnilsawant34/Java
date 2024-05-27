package factorial;
import java.util.*;

class FactorialApp
{
	int no,f=1;
	
	void setValue(int no)
	{
		this.no=no;
	}
	
	int getFactorial()
	{
		for(int i=1;i<=no;i++)
		{
			f=f*i;
			
		}
		return f;
	}
	
	

}
public class Factorial {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		
		FactorialApp fact= new FactorialApp();
		
		int no;
		
		System.out.println("Enter the number\n");
		no=xyz.nextInt();
		
		
		fact.setValue(no);
		
		int result=fact.getFactorial();
		
		System.out.println("Factorial is "+result);
	}
}


