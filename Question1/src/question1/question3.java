package question1;
import java.util.*;
class Sum
{
	int a[];
	
	void setValue(int a[])
	{
		this.a=a;
	}
	
	int getSum()
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		return sum;
	}
}




public class question3 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter thhe array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
			
		}
		
		Sum s=new Sum();
		
		s.setValue(a);
		int result=s.getSum();
		System.out.println("Sum is"+result);

	}

}
