package armstrong_constructor;
import java.util.*;
class Sum{
	int sum=0;
	void calSum(int ...a) {
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(+sum);
	}
	
}
public class Variable_Argument {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Sum s=new Sum();
		System.out.println("Enter the size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++) {
			a[i]=xyz.nextInt();
		}
		s.calSum(a);

	}

}
